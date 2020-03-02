package com.itheima.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itheima.dao.LiveDao;
import com.itheima.domain.Live;
import com.itheima.utils.HibernateUtils;

public class LiveDaoImpl implements LiveDao {
	//查询所有直播
	@Override
	public List<Live> findAllLive() {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "from Live where status=? or status=?";
		Query query = session.createQuery(sql);
		query.setParameter(0,Long.valueOf("0"));//状态为申请
		query.setParameter(1,Long.valueOf("1"));//状态为进行中
		List<Live> list = query.list();
		System.out.println("size:"+list.size());
		tx.commit();
		
		return list;
	}
	/**
	 * 增加直播源
	 */
	@Override
	public void addLive(Live live) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		
		
		tx.commit();
	}
	/**
	 * 开启直播
	 */
	@Override
	public void openLive(Long liveid) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//先查询，再更改
		Live live = session.get(Live.class,liveid);
		//设置为1
		live.setStatus(Long.valueOf("1"));
		session.update(live);
		tx.commit();
	}
	/**
	 * 关闭直播
	 */
	@Override
	public void closeLive(Long liveid) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//先查询，再更改
		Live live = session.get(Live.class,liveid);
		//设置为2
		live.setStatus(Long.valueOf("2"));
		session.update(live);
		
		tx.commit();
	}
	/**
	 * 根据前台传回来的值，查询单个
	 */
	@Override
	public Live findOne(Long id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//先查询
		Live live = session.get(Live.class,id);
		
		tx.commit();
		return live;
	}
	

	
	

}
