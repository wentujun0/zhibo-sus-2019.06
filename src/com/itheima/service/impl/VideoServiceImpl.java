package com.itheima.service.impl;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import com.itheima.dao.VideoDao;
import com.itheima.dao.impl.VideoDaoImpl;
import com.itheima.domain.Video;
import com.itheima.service.VideoService;

public class VideoServiceImpl implements VideoService {
	
	private VideoDao videoDao =  new VideoDaoImpl();
	@Override
	public List<Video> findAllVideo() {
		// TODO Auto-generated method stub
		
		
		List<Video> list = videoDao.findAllVideo();
		for (int i = 0; i < list.size(); i++) {
			Video video = list.get(i);
			if(video.getCreate_date()==null){
				Date dateNew = new Date(0001, 01, 01);
				video.setCreate_date(dateNew);
			}else {
				System.out.println("不测试了");
				//DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				//String dateString = df.format(video.getCreate_date());
			}
		}
		
		return list;
	}
	//上传视频
	@Override
	public void uploadVideo(Video video) {
		// TODO Auto-generated method stub
		//上传时间
		 java.sql.Date dateMysql = new java.sql.Date(Long.valueOf(System.currentTimeMillis()));
		
		 
		 video.setName(video.getRealname());
		 //设置src的url值
		 String url="http://localhost:5080/oflaDemo/video2.html";
		 video.setCreate_date(dateMysql);
		 video.setUrl(url);
		videoDao.uploadVideo(video);
		
		
	}
	/*
	 * 删除视频的service层
	 */
	@Override
	public void deleteVideo(long videoid) {
		// TODO Auto-generated method stub
		VideoService videoService = new VideoServiceImpl();
		//删除数据库中的视频
		
		
		
		videoService.deleteVideo(videoid);
	}
	@Override
	public Video findOne(long id) {
		// TODO Auto-generated method stub
		VideoDao videoDao = new VideoDaoImpl();
		
		Video video = videoDao.findOne(id);
		
		return video;
	}

}
