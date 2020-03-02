package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Live;
import com.itheima.domain.Video;

public interface ShowViewDao {
	//展示视频源
	public List<Video> showVideo();
	//展示直播源
	public List<Live> showLive();
}
