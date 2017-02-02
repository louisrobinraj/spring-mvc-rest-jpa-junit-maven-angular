package com.sjc.hrms.dao.persistence;

import com.sjc.hrms.core.persistence.JpaDAO;
import com.sjc.hrms.model.persistence.UserDetail;

public interface UserDetailDao extends JpaDAO<UserDetail> {

	UserDetail getUserDetails(UserDetail user);

	String getUserToken(UserDetail user);

	Object[] getUserTokenAndIsEnable(UserDetail user);

	Object[] getUserTokenAndIsEnableToUppercase(UserDetail user); 


}
