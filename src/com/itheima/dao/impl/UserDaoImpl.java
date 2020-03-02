package com.itheima.dao.impl;

import java.util.List; 

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itcast.bean.Result;
import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.utils.HibernateUtils;
/**
 * 用户DAO的实现类
 * @author jt
 *
 */
public class UserDaoImpl implements UserDao {

	@Override
	// 用户的DAO的登录的方法:
	public User login(User user) {
		//System.out.println("dao层怎么不能运行呀？");
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//System.out.println(sql);
		String sql = "from User where username=? and password=?";
		System.out.println(sql);
		Query query = session.createQuery(sql);
		// 设置参数:
		query.setParameter(0, user.getUsername());
		query.setParameter(1, user.getPassword());
		List<User> list = query.list();
		if(list.size()>0){
			return list.get(0);
		}
		
		tx.commit();
		return null;
	}

	@Override
	//查询用户列表,
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		 
		
		String sql = "from User where level=?";
		Query query = session.createQuery(sql);
		query.setParameter(0,Long.valueOf("1"));//查询教师
		List<User> list = query.list();
		
		
		
		tx.commit();
		
		return list;
	}

	@Override
	//新增单个用户
	public  User addUser(User user) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(user);
		//判断是否成功
		//Result re = new Result();
		//re.setMsg("success");
		//re.setUser(user);
		tx.commit();
		return user;
	}
	//删除个别用户
	@Override
	public void deleteUser(String userid) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//serializable
		System.out.println("最后要删除的字符"+userid);
		User user = session.get(User.class,Long.valueOf(userid));
		session.delete(user);
		tx.commit();
	}
	

}
