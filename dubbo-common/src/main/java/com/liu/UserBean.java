package com.liu;

import java.io.Serializable;

public class UserBean implements Serializable {
	private static final long serialVersionUID = 6699726407846151392L;
	int userId;
	String name;

	public UserBean(int userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
