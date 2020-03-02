package com.itcast.test;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

//Apache的框架
import com.itheima.domain.Video;
import com.itheima.service.VideoService;
import com.itheima.service.impl.VideoServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Struts2Upload extends ActionSupport implements ModelDriven<Video> {
	

	private Video video = new Video();
	
	
		private File upload;//定义一个File ,变量名要与jsp中的input标签的name一致
	    private String uploadContentType;//上传文件的mimeType类型
	    private String uploadFileName;//上传文件的名称
	
	public File getUpload() {
			return upload;
		}
		public void setUpload(File upload) {
			this.upload = upload;
		}
		public String getUploadContentType() {
			return uploadContentType;
		}
		public void setUploadContentType(String uploadContentType) {
			this.uploadContentType = uploadContentType;
		}
		public String getUploadFileName() {
			return uploadFileName;
		}
		public void setUploadFileName(String uploadFileName) {
			this.uploadFileName = uploadFileName;
		}
		
	@Override
	public Video getModel() {
		// TODO Auto-generated method stub
		return video;
	}
	//测试文件上传
	
	public String upload() {
		//根据相对路径获取绝对路径
		 //String realPath=ServletActionContext.getServletContext().getRealPath("d:\\upload");
		/*	String path = "C:"+File.separator+"my.doc" ;
		System.out.println(path);
		File.separator 　这是用你所用的系统默认的文件分割符，*/
	    // String path = "d:\\upload";
		 String path = "E:"+File.separator+"java"+File.separator+"red5-server-1.0.7"+File.separator+"webapps"+File.separator+"oflaDemo"+File.separator+"streams"+File.separator+"upload";
		 File file = new File(path);
		//System.out.println("+++++++++++++++++++错误在upload");
		//System.out.println("uploadContentType:"+uploadContentType);
		//System.out.println("uploadFileName:"+uploadFileName);
		//文件格式进行校验
		if(!("video/mp4".equals(uploadContentType)||"text/plain".equals(uploadContentType)||"video/x-flv".equals(uploadContentType))){
			this.addActionError("上传的文件的格式不对，请重新上传");
			return"uploadFaile";
		}
		try {
			FileUtils.copyFile(upload,new File(file, "video2"));//名字暂定为video2
			//System.out.println("保存成功");
			//System.out.println("video:"+video);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("错误是："+e);
		}
		//VideoService videoService = new VideoServiceImpl();
		//videoService.uploadVideo(video);
		
		return SUCCESS;
		
	}
	
	
}
	
