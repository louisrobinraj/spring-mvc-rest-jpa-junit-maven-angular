package com.sjc.hrms.model.persistence;

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

	@Column
	private String token;

	@Column
	private boolean isEnableUSer;

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

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isEnableUSer() {
		return isEnableUSer;
	}

	public void setEnableUSer(boolean isEnableUSer) {
		this.isEnableUSer = isEnableUSer;
	}

}