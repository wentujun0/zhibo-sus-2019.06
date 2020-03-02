package com.itheima.utils;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate的工具类
 * @author jt
 *
 */
public class HibernateUtils {

	public static final Configuration cfg;
	public static final SessionFactory sf;
	
	static{
		System.out.println("开始自动寻找配置文件");
		cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();
		//System.out.println("配置文件");
	}
	
	public static Session openSession(){
		return sf.openSession();
	}
	
	public static Session getCurrentSession(){
		return sf.getCurrentSession();
	}
}
