package com.itheima.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.dao.LoginDao;
import com.itheima.domain.User;
import com.itheima.utils.HibernateUtils;

public class LoginDaoImpl implements LoginDao {
	//为了安全，先查询再修改，传入，user_id,和newpassword
	@Test
	public void updatePassword(long userid,String newpassword){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//根据唯一标识符查询到user
		User user = session.get(User.class,userid);
		//修改user
		user.setPassword(newpassword);
		session.update(user);
		System.out.println(user);
		tx.commit();
		
		
	}
}
