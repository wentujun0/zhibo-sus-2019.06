package com.itheima.service.impl;

import java.util.List; 

import com.itheima.dao.ShowViewDao;
import com.itheima.dao.impl.ShowViewDaoImpl;
import com.itheima.domain.Live;
import com.itheima.domain.Video;
import com.itheima.service.ShowViewService;

public class ShowViewImpl implements ShowViewService {

	@Override
	public List<Video> showVideo() {
		// TODO Auto-generated method stub
		ShowViewDao show = new ShowViewDaoImpl();
		List<Video> list = show.showVideo();
		return list;
	}

	@Override
	public List<Live> showLive() {
		// TODO Auto-generated method stub
		ShowViewDao show = new ShowViewDaoImpl();
		List<Live> list = show.showLive();
		return list;
	}

}
