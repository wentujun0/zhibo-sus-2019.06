package com.itheima.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.itheima.dao.ShowDao;
import com.itheima.domain.Company;
import com.itheima.domain.Office;
import com.itheima.utils.HibernateUtils;

public class ShowDaoImpl implements ShowDao {

	@Override
	public List<Company> companyList() {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		//String sql = "select * from Company";
		String hql = "from Company order by id desc";
		//SQLQuery query = session.createSQLQuery(sql);
		Query query = session.createQuery(hql);
		List<Company> list = new ArrayList<Company>();
		list = query.list();
		//打印
		for (Company company : list) {
			System.out.println(company);
		}
	
		tx.commit();
		
		
		return list;
	}

	@Override
	public List<Office> officeList(long companyid) {
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		//String sql = "select * from Office";
		
		//SQLQuery query = session.createSQLQuery(sql);
		String hql = "from Office where company_id=?";
		
		Query query = session.createQuery(hql);
		
		query.setLong(0,companyid);
			List<Office> list = query.list();
			//打印
			for (Office office : list) {
				System.out.println(office);
			}
		
		tx.commit();
		
		
		return list;
	}

}
