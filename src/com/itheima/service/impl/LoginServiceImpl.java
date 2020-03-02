package com.itheima.service.impl;

import java.util.List;

import com.itheima.dao.LoginDao;
import com.itheima.dao.impl.LoginDaoImpl;
import com.itheima.domain.Live;
import com.itheima.service.LiveService;
import com.itheima.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public void updatePassword(long userid, String newpassword) {
		// TODO Auto-generated method stub
		LoginDao loginDao = new LoginDaoImpl();
		loginDao.updatePassword(userid, newpassword);
	}

	

}
