package com.itheima.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List; 

import org.junit.Test;

import com.itcast.bean.Result;
import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import com.itheima.service.UserService;
/**
 * 用户的业务层的实现类
 * @author jt
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	// 业务层用户登录的方法:
	public User login(User user) {
		System.out.println("userService层");
		UserDao userDao = new UserDaoImpl();
		return userDao.login(user);
	}
	//查询用户列表
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		
		UserDao userDao = new UserDaoImpl();
		return userDao.findAllUser();
	}
	//新增用户
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		//Result result = new Result();
		//在service层将level设定为1
		user.setLevel(Long.valueOf(1));
		//user.setCreate_time()
		
		
		UserDao userDao = new UserDaoImpl();
		//result.setUser();
		return userDao.addUser(user);
		
		
	}
	//删除个别用户
	@Override
	public void deleteUser(String userid) {
		// TODO Auto-generated method stub
		UserDao userDao = new UserDaoImpl();
		userDao.deleteUser(userid);
	}
	
}
