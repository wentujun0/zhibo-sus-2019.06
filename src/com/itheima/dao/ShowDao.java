package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Company;
import com.itheima.domain.Office;

public interface ShowDao {
	//查询company
	public List<Company> companyList();
	//查询office
	public List<Office> officeList(long compangyid);
}
