package com.itheima.service;

public interface LoginService {
	
	//更改当前用户的密码
	public void updatePassword(long userid,String newpassword);
}
