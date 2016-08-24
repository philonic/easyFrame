package me.ssm.vo;

import me.ssm.entity.User;

public class UserVo {

	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserVo(User user) {
		super();
		this.user = user;
	}
	
	public UserVo() {
	}

	@Override
	public String toString() {
		return "UserVo [user=" + user + "]";
	}
	
	
}
