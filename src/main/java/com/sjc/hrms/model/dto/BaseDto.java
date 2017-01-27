package com.sjc.hrms.model.dto;

import java.io.Serializable;

public  class BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;

	protected String id;

	protected Long version;

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
