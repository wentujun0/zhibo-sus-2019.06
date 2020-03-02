package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Live;

public interface LiveDao {

	//展示直播列表
	public List<Live> findAllLive();
	//增加直播
	public void addLive(Live live);
	//开启直播
	public void openLive(Long liveid);
	//关闭直播
	public void closeLive(Long liveid);
	//查找一个直播
	public Live findOne(Long id);
}
