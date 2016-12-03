package com.sjc.hrms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sjc.hrms.model.UserDetail;
import com.sjc.hrms.model.UserDetail;
import com.sjc.hrms.services.UserService;
import com.sjc.hrms.utils.Constants;

import javax.validation.Valid;

@RestController
public class LoginController extends BaseController {

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/hrms/authenticate", method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("user") UserDetail user) {
		ModelAndView model = null;
		try {
			boolean isValidUser = userService.isValidUser(user);
			model = new ModelAndView("menu");
			if (isValidUser) {
			} else {
				model = new ModelAndView("index");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;

	}

	@RequestMapping(value = "/hrms/logout", method = RequestMethod.POST)
	public void handleLogout(String userName, HttpServletResponse response) {
		LOGGER.info("Triggering logout");
		if (!StringUtils.hasText(userName)) {
			throw new IllegalArgumentException("Username must not be null or empty!");
		}
		userService.logout(userName, response);
	}

	public ModelAndView authenticateUser(@Valid @ModelAttribute("loginBean") UserDetail loginBean,
			BindingResult bindingresult, HttpSession session, HttpServletRequest request, Model model) {
		return null;

	}
	
//	
//	public ModelAndView authenticateUser(@Valid @ModelAttribute("loginBean") LoginBean loginBean,
//			BindingResult bindingresult, HttpSession session, HttpServletRequest request, Model model) {
//		ModelAndView view = new ModelAndView();
//		if (!bindingresult.hasErrors()) {
//			LoginBean userData=authenticationDao.checkUserCredantial(loginBean.getUserName(),loginBean.getPassword());
//			if (userData==null) {
//				bindingresult.addError(new ObjectError("invalid", "Invalid Credentials!!!"));
//				logger.error("invalid credential");
//				view.setViewName(Constants.INDEXPAGE);
//			} else {
//				session.setAttribute("Login_userName", loginBean.getUserName());
//				logger.debug("login user -->" + session.getAttribute("Login_userName"));
//				view.setViewName(Constants.SUCCESSPAGE);
//			}
//		}else{
//			logger.debug("please enter valid user details");
//			view.setViewName(Constants.INDEXPAGE);
//		}
//
//		return view;
//
//	}
//	
//	
//	
//	
	
}
