package com.sjc.hrms.controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sjc.hrms.model.dto.UserDetailDto;
import com.sjc.hrms.model.persistence.UserDetail;
import com.sjc.hrms.services.UserService;

@RestController
public class LoginController extends BaseController {
	

	private static final Logger LOGGER = Logger.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/hrms/authenticate", method = RequestMethod.POST)
	public boolean loginUser(@RequestBody UserDetailDto userDetailDto) {
		UserDetail user = new UserDetail();
		BeanUtils.copyProperties(userDetailDto, user);
		boolean isValidUser = userService.isValidUser(user);
		return isValidUser;
	}

	@RequestMapping(value = "/hrms/logout/{userName}", method = RequestMethod.GET)
	public void logout(@PathVariable String userName, HttpServletResponse response) {
		LOGGER.info("Triggering logout");
		if (!StringUtils.hasText(userName)) {
			throw new IllegalArgumentException("Username must not be null or empty!");
		}
		userService.logout(userName, response);
	}

	@RequestMapping(value = "/hrms/forgetPassword/{userName}", method = RequestMethod.GET)
	public ModelAndView forgetPassword(@PathVariable String userName, HttpServletResponse response) {
		LOGGER.info("forgetPassword load forgot page");
		if (!StringUtils.hasText(userName)) {
			throw new IllegalArgumentException("Username must not be null or empty!");
		}
		return new ModelAndView("resetPassword");
	}

	@RequestMapping(value = "/hrms/home/", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView = new ModelAndView("common/home-page");
		return modelAndView;
	}

	// @RequestMapping(value = "/hrms/authenticate", method =
	// RequestMethod.POST)
	// public ModelAndView login(@Valid @ModelAttribute("user") UserDetail user,
	// BindingResult bindingresult,
	// HttpServletRequest request, HttpServletResponse response, HttpSession
	// session, Model model)
	// throws Exception {
	// ModelAndView modelAndView = new ModelAndView();
	// if (bindingresult.hasErrors()) {
	// modelAndView = new ModelAndView("common/login-page");
	// } else {
	// boolean isValidUser = userService.isValidUser(user);
	// if (isValidUser) {
	// session.setAttribute("userName", user.getUserName());
	// modelAndView.setViewName("common/menu");
	// } else {
	// model.addAttribute("message", "Invalid User Credantial.");
	// modelAndView.setViewName("common/login-page");
	// }
	// }
	// return modelAndView;
	// }
}
