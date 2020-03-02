package com.itcast.test;

import java.text.DateFormat; 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.itheima.dao.LiveDao;
import com.itheima.dao.VideoDao;
import com.itheima.dao.impl.LiveDaoImpl;
import com.itheima.dao.impl.VideoDaoImpl;
import com.itheima.domain.Company;
import com.itheima.domain.Live;
import com.itheima.domain.Office;
import com.itheima.domain.User;
import com.itheima.domain.Video;
//import com.itheima.hibernate.domain.Customer;
import com.itheima.service.VideoService;
import com.itheima.utils.HibernateUtils;

/**
 * 测试hibernate
 * @author l
 *
 */
public class HibernateDemo1 {
	@Test
	public void demo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		System.out.println("这里应该没有问题吧");
		//创建一个用户
		User user = new User();
		user.setPassword("1234");
		user.setUsername("masan");
		user.setName("马三立");
		long level = 1;
		user.setLevel(level);
		//user.setUser_id(4);
		
		session.save(user);
		
		tx.commit();
	}
	@Test
	public void demo2(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		System.out.println("--------");
		User user = session.get(User.class, 1l);// 发送一条查询客户的SQL
		System.out.println(user);
		
		tx.commit();
	}
	//查询所有用户
	@Test
	public void usertestdemo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "from Video";
		Query query = session.createQuery(sql);
		List<Video> list = query.list();
		for (Video video : list) {
			System.out.println(video);
			
		}
		tx.commit();
	}
	
	
	//查询视频列表
	@Test
	public void demo3(){
		VideoDao video = new VideoDaoImpl();
		List<Video> list = video.findAllVideo();
		for (Video video2 : list) {
			System.out.println(video2);
		}
	}
	
	@Test
	//插入videmo中date\
	public void insertdatetoVideo(){
		java.sql.Date dateMysql = new java.sql.Date(Long.valueOf(System.currentTimeMillis()));
		Video video = new Video();
		video.setName("test");
		video.setCreate_date(dateMysql);
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(video);
		
		tx.commit();
		
		
		
	}
	
	
	
	@Test
	//测试当前时间
	public void demo4(){
		//获取时间戳
		long currentTimeMillis = System.currentTimeMillis();//1、
		
		System.out.println(currentTimeMillis);
		
		 Date date = new Date();
		 System.out.println(date);
		  DateFormat df = new SimpleDateFormat("yyyyMMdd");
		 String dateString = df.format(date);
		 Long datetoLong = Long.valueOf(dateString);
		 
		 System.out.println("long:"+datetoLong);
		//Date datetoDate = df.parse(dateString);
		
		 
		 
		 // System.out.println("当前:"+datetoDate);
		  java.sql.Date dateMysql = new java.sql.Date(Long.valueOf(System.currentTimeMillis()));//2
		  System.out.println("dateMysql:"+dateMysql);//3
		  
		  
		  
		 System.out.println("最后："+new java.sql.Date(datetoLong)); 
		  
		 
	}
	//获取MySQL中的日期date
	@Test
	public void testdemo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		String sql = "select create_time from User ";
		Query query = session.createQuery(sql);
		String queryString = query.getQueryString();
		System.out.println(queryString);
		List<java.sql.Date> list = query.list();
		
		System.out.println("list"+list);
		tx.commit();
		
		
	}
	//
	@Test
	public void livedemo1(){
		LiveDao liveDao = new LiveDaoImpl();
		List<Live> list = liveDao.findAllLive();
		System.out.println(list);
	}
	@Test
	//live模糊查询
	public void livedemo2(){
		String na = "王";
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//String sql = "from Live where name Like '%"+na+"%'" ;//注意要有''
		String hql = "from Live where name Like:name";
		
		Query query = session.createQuery(hql);
		//query.setParameter(0,"na");
		query.setString("name", "%"+na+"%");
		String queryString = query.getQueryString();
		System.out.println(queryString);
		List<Live> list = query.list();
		System.out.println(list);
		tx.commit();
		
	}
	@Test
	public void officeDemo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		//String sql = "select * from Office";
		
			//SQLQuery query = session.createSQLQuery(sql);
		String hql = "from Office where company_id=?";
		
		Query query = session.createQuery(hql);
		
		query.setLong(0,4);
			List<Office> list = query.list();
			//打印
			for (Office office : list) {
				System.out.println(office);
			}
		
		tx.commit();
		
	}
	@Test
	public void companyDemo1(){
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//String sql = "select * from Company";
		String hql = "from Company";
		//SQLQuery query = session.createSQLQuery(sql);
		Query query = session.createQuery(hql);
		List<Company> list = query.list();
		//打印
		for (Company company : list) {
			System.out.println(company);
		}
	
		tx.commit();
	}
	
	
}
