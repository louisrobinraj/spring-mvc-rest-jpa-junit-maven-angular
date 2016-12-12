package com.sjc.hrms.services;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import com.sjc.hrms.model.UserDetail;

@Transactional
//@Transactional(readOnly = true)
public interface UserService {

	public boolean isValidUser(UserDetail user) throws Exception;

	public boolean logout(String userName, HttpServletResponse response);

}
