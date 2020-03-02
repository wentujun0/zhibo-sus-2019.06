package com.itheima.utils;

import java.sql.Date;

public class DateFormate {
//先设置获取本地时间库
	public static Date toMySQLDate(){
		 java.sql.Date dateMysql = new java.sql.Date(Long.valueOf(System.currentTimeMillis()));
		 return dateMysql;
	}
}
