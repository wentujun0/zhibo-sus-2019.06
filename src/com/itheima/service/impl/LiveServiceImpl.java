package com.itheima.service.impl;

import java.sql.Timestamp;
import java.util.List;

import com.itheima.dao.LiveDao;
import com.itheima.dao.impl.LiveDaoImpl;
import com.itheima.domain.Live;
import com.itheima.service.LiveService;

public class LiveServiceImpl implements LiveService {

	@Override
	public List<Live> findAllLive() {
		// TODO Auto-generated method stub
		LiveDao liveDao = new LiveDaoImpl();
		List<Live> list = liveDao.findAllLive();
		
		return list;
	}
	//增加直播
	@Override
	public void addLive(Live live) {
		// TODO Auto-generated method stub
		LiveDao liveDao = new LiveDaoImpl();
		
		//获取当前时间，设置为直播创建时间
		java.sql.Date dateMysql = new java.sql.Date(Long.valueOf(System.currentTimeMillis()));
		live.setCreate_date(dateMysql);
		
		
		liveDao.addLive(live);
	}
	//开启直播
	@Override
	public void openLive(Long liveid) {
		// TODO Auto-generated method stub
		LiveDao liveDao = new LiveDaoImpl();
		liveDao.openLive(liveid);
		
		
	}
	//关闭直播
	@Override
	public void closeLive(Long liveid) {
		// TODO Auto-generated method stub
		LiveDao liveDao = new LiveDaoImpl();
		liveDao.closeLive(liveid);
	}
	@Override
	public Live findOne(Long id) {
		// TODO Auto-generated method stub
		LiveDao liveDao = new LiveDaoImpl();
		Live live = liveDao.findOne(id);
		
		
		return live;
	}

}
