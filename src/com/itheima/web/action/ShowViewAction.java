package com.itheima.web.action;

import java.util.List;

import com.google.gson.Gson;
import com.itheima.dao.ShowViewDao;
import com.itheima.dao.impl.ShowViewDaoImpl;
import com.itheima.domain.Live;
import com.itheima.domain.Video;
import com.opensymphony.xwork2.ActionSupport;

public class ShowViewAction extends ActionSupport {
	private String livedata;
	private String videodata;
	
	
	
	
	public String getLivedata() {
		return livedata;
	}
	public void setLivedata(String livedata) {
		this.livedata = livedata;
	}
	public String getVideodata() {
		return videodata;
	}
	public void setVideodata(String videodata) {
		this.videodata = videodata;
	}
	//直播列表，status=1；
	public String showLive(){
		
		ShowViewDao show = new ShowViewDaoImpl();
		List<Live> list = show.showLive();
		Gson gson = new Gson();
		livedata = gson.toJson(list);
		
		return "viewliveSucces";
	}
	//视频列表
	public String showVideo(){
		ShowViewDao show = new ShowViewDaoImpl();
		List<Video> list = show.showVideo();
		Gson gson = new Gson();
		videodata = gson.toJson(list);
		
		System.out.println(list);
		return "viewvideoSuccess";
		
		
	}
	
	
}
