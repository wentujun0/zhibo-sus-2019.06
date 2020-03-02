package com.itheima.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itheima.dao.VideoDao;

import com.itheima.domain.Video;
import com.itheima.utils.HibernateUtils;

public class VideoDaoImpl implements VideoDao{
	
	
	//video的遍历
	@Override
	public List<Video> findAllVideo() {
		// TODO Auto-generated method stub
		//创建session会话工厂
		System.out.println("进入了videoDao");
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "from Video";
		Query query = session.createQuery(sql);
		
		//query.setParameter(0,1);//查询教师
		List<Video> list = query.list();
		if(list.size()>0){
			return list;
		}
		
		tx.commit();
		return null;
	}
	//上传视频
	@Override
	public void uploadVideo(Video video) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		
		session.saveOrUpdate(video);
		
		System.out.println(video);
		tx.commit();
	}
	//删除视频
	@Override
	public void deleteVideo(Long videoid) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//先查询，后删除
		Video video = session.get(Video.class, videoid);
		//删除
		session.delete(video);
		
		tx.commit();
	}
	//查找一个视频
	@Override
	public Video findOne(long id) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//先查询
		Video video = session.get(Video.class, id);
		tx.commit();
		System.out.println(video);
		return video;
	}

}
