package me.ssm.vo;

import me.frame.base.BaseWebVo;
import me.ssm.entity.User;

public class UserWebVo extends BaseWebVo{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2006477308534956253L;
	
	
	User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserWebVo(int code, String desc, User user) {
		super(code, desc);
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserWebVo [user=" + user + "]";
	}
	
	public UserWebVo() {
	}

	
	
}
