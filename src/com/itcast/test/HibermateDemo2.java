package com.itcast.test;

import java.util.List;

import org.junit.Test;

import com.itheima.dao.ShowViewDao;

import com.itheima.dao.impl.ShowViewDaoImpl;
import com.itheima.domain.Live;
import com.itheima.domain.Video;

public class HibermateDemo2 {
	@Test
	/**
	 * 正在直播
	 */
	public void livedemo1(){
		ShowViewDao show = new ShowViewDaoImpl();
		List<Live> list = show.showLive();
		for (Live live : list) {
			System.out.println(live);
		}
	}
	/**
	 * 查询所有的视频
	 * 
	 */
	@Test
	public void videodemo1(){
		ShowViewDao show = new ShowViewDaoImpl();
		List<Video> list = show.showVideo();
		for (Video video : list) {
			System.out.println(video);
		}
	}
}
