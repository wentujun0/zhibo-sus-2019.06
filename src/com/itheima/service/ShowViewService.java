package com.itheima.service;

import java.util.List;

import com.itheima.domain.Live;
import com.itheima.domain.Video;

public interface ShowViewService {
	//前台视频展示
	public List<Video> showVideo();
	//前台直播，正在直播的展示
	public List<Live> showLive();
	//
}
