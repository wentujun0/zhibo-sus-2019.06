package com.itheima.service;

import java.util.List;

import com.itheima.domain.Video;

public interface VideoService {
	public List<Video> findAllVideo();
	public void uploadVideo(Video video);
	//删除视频
	public void deleteVideo(long videoid);
	//查找一个视频
	public Video findOne(long id);
}
