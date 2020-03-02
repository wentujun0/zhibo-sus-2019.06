package com.itheima.web.action;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.itheima.domain.User;
import com.itheima.domain.Video;
import com.itheima.service.VideoService;
import com.itheima.service.impl.VideoServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class VideoAction extends ActionSupport implements ModelDriven<Video>{
	
	private Video video = new Video();
	private String videodata ;//返回video数据
	public String getVideodata() {
		return videodata;
	}

	public void setVideodata(String videodata) {
		this.videodata = videodata;
	}

	private String id ;//接收video，id
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	


	@Override
	public Video getModel() {
		// TODO Auto-generated method stub
		return video;
	}
	
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}

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

	//列表查询
	public String findAllVideo(){
		
		VideoService videoService = new VideoServiceImpl();
		List<Video> videolist = videoService.findAllVideo();
		System.out.println("查询到了结果！");
		int len = videolist.size()+1;
		int size = 10;
		int page = len/size + 1; 
		//将值存入到值栈中
		ActionContext.getContext().getValueStack().set("list", videolist);
		ActionContext.getContext().getValueStack().set("totle", len);
		ActionContext.getContext().getValueStack().set("size", size);
		ActionContext.getContext().getValueStack().set("page", page);
		
		
		return "findAllSuccess";
		
	}
	//视频上传功能
	public String UploadVideo(){
		//获取现在用户的id
		User existUser = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		Long userid = existUser.getUser_id();
		video.setCreate_by(userid);//设置id
		//上传到本地后，然后开始向数据库传值
		 //String realPath=ServletActionContext.getServletContext().getRealPath("d:\\upload");
		 
		
	/*	String path = "C:"+File.separator+"my.doc" ;
		System.out.println(path);
		File.separator 　这是用你所用的系统默认的文件分割符，*/
		String path = "E:"+File.separator+"java"+File.separator+"red5-server-1.0.7"+File.separator+"webapps"+File.separator+"oflaDemo"+File.separator+"streams"+File.separator+"upload";
		
	    //String path = "E:/java/red5-server-1.0.7/webapps/oflaDemo/streams/upload";
		 File file = new File(path);
		System.out.println("uploadContentType:"+uploadContentType);
		System.out.println("uploadFileName:"+uploadFileName);
		//文件格式进行校验
		if(!("video/mp4".equals(uploadContentType)||"text/plain".equals(uploadContentType)||"video/x-flv".equals(uploadContentType))){
			this.addActionError("上传的文件的格式不对，请重新上传");
			return"uploadFaile";
			
		}
		
		try {
			FileUtils.copyFile(upload,new File(file, "video2.mp4"));
			//System.out.println("保存成功");
			System.out.println("video:"+video);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("错误是："+e);
		}
		VideoService videoService = new VideoServiceImpl();
		videoService.uploadVideo(video);
		
		//return NONE;
		
		//上传成功
		return "uploadSuccess";
	}
	/**
	 * 单独查找一个的视频的页面
	 */
	public String findOne(){
		//Gson gson = new Gson();
		
		System.out.println("id:"+video.getIdString());
		VideoService videoService = new VideoServiceImpl();
		Video findOne = videoService.findOne(Long.valueOf(video.getIdString()));
		Gson gson = new Gson();
		videodata = gson.toJson(findOne);
		System.out.println(videodata);
		
		return "findOneSuccess";
	}
	
	
	
	
}
