package com.sjc.hrms.persistence;

import com.sjc.hrms.core.persistence.JpaDAO;
import com.sjc.hrms.model.persistence.UserDetail;

public interface UserDetailDao extends JpaDAO<UserDetail> {

	UserDetail getUserDetails(UserDetail user); 


}
