package com.sjc.hrms.services;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.sjc.hrms.model.UserDetail;
import com.sjc.hrms.model.UserDetail;

@Transactional
public interface UserService {

	public boolean isValidUser(UserDetail user);

	public boolean logout(String userName, HttpServletResponse response);

}
