package com.itheima.service;

import java.util.List;

import com.itcast.bean.Result;
import com.itheima.domain.User;

/**
 * 用户的业务层的接口
 * @author jt
 *
 */
public interface UserService {

	User login(User user);
	
	//查询用户列表
	List<User> findAllUser();
	//新增用户
	User addUser(User user);
	//修改密码
	
	//删除个别用户
	void deleteUser(String userid);
}
