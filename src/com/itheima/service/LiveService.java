package com.itheima.service;

import java.util.List;

import com.itheima.domain.Live;

public interface LiveService {
	public List<Live> findAllLive();
	public void addLive(Live live);
	//开启直播
	public void openLive(Long liveid);
	//关闭直播
	public void closeLive(Long liveid);
	//查找一个直播
	public Live findOne(Long id);
}
