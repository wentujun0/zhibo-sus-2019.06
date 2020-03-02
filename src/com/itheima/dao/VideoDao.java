package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Video;

public interface VideoDao {
	//视频列表展示
	public List<Video> findAllVideo();
	public void uploadVideo(Video video);
	//删除视频
	public void deleteVideo(Long videoid);
	//查找一个视频
	public Video findOne(long id);
}
