package com.itheima.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itheima.dao.ShowViewDao;
import com.itheima.domain.Live;
import com.itheima.domain.Video;
import com.itheima.utils.HibernateUtils;

public class ShowViewDaoImpl implements ShowViewDao {
	/**
	 * 前台查找视频
	 */
	@Override
	public List<Video> showVideo() {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "from Video";
		Query query = session.createQuery(sql);
		
		//query.setParameter(0,1);//查询教师
		//查询到所有的视频，传回前台
		List<Video> list = query.list();
		System.out.println("size:"+list.size());
	
		
		tx.commit();
		
		return list;
	}
	/**
	 * 前台查找所有正在直播的直播源
	 */
	@Override
	public List<Live> showLive() {
		// TODO Auto-generated method stub
		//查询正在直播的直播源
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "from Live where status=?";
		Query query = session.createQuery(sql);
		query.setParameter(0,Long.valueOf("1"));
		//正在直播的直播源
		List<Live> list = query.list();
		System.out.println("size:"+list.size());
		tx.commit();
		
		return list;
		
	
	}

}
