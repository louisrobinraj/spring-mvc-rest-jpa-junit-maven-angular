package com.sjc.hrms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "UserDetail")
public class UserDetail extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column
	@NotEmpty
	private String userName;
	@NotEmpty
	@Column
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}