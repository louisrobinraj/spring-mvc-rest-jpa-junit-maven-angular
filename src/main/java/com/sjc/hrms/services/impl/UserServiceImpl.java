package com.sjc.hrms.services.impl;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sjc.hrms.model.UserDetail;
import com.sjc.hrms.persistence.UserDetailDao;
import com.sjc.hrms.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDetailDao userDetailDao;

	@Override
	public boolean isValidUser(UserDetail user) {

		UserDetail userData = userDetailDao.getUserDetails(user);
		if (userData != null && userData.getUserName().equals(user.getUserName())) {
			return true;
		}
		return false;

	}

	@Override
	public boolean logout(String userName, HttpServletResponse response) {
		return true;
	}

}
