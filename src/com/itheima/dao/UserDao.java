package com.itheima.dao;

import java.util.List;

import com.itcast.bean.Result;
import com.itheima.domain.User;

/**
 * 用户的DAO的接口
 * @author jt
 *
 */
public interface UserDao {
	//登录查询
	public User login(User user);
	//查询用户列表
	public List<User> findAllUser();
	//新增用户
	 public User addUser(User user);
	//删除个别 用户
	public void deleteUser(String userid);
}
