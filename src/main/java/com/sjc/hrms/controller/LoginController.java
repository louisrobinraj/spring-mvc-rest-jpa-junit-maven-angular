package com.sjc.hrms.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sjc.hrms.exception.GenericException;
import com.sjc.hrms.model.UserDetail;
import com.sjc.hrms.services.UserService;

@RestController
public class LoginController extends BaseController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/hrms/authenticate", method = RequestMethod.POST)
	public ModelAndView executeLogin(@Valid @ModelAttribute("user") UserDetail user, BindingResult bindingresult,
			HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingresult.hasErrors()) {
			modelAndView = new ModelAndView("common/login-page");
		} else {
			try {
				boolean isValidUser = userService.isValidUser(user);
				modelAndView.setViewName("common/menu");
				if (isValidUser) {
				} else {
					modelAndView.setViewName("common/login-page");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return modelAndView;
	}

	@RequestMapping(value = "/hrms/logout", method = RequestMethod.POST)
	public void handleLogout(String userName, HttpServletResponse response) {
		LOGGER.info("Triggering logout");
		if (!StringUtils.hasText(userName)) {
			throw new IllegalArgumentException("Username must not be null or empty!");
		}
		userService.logout(userName, response);
	}

	@RequestMapping(value = "/error/{type:.+}", method = RequestMethod.GET)
	public ModelAndView getPages(@PathVariable("type") String type) throws Exception {

		if ("error".equals(type)) {
			// go handleCustomException
			throw new GenericException("E888", "This is custom message");
		} else if ("io-error".equals(type)) {
			// go handleAllException
			throw new IOException();
		} else {
			return new ModelAndView("index").addObject("msg", type);
		}

	}

}
