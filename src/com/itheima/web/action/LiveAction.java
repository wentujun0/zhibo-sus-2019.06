package com.itheima.web.action;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List; 

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.itheima.domain.Live;
import com.itheima.domain.User;
import com.itheima.service.LiveService;
import com.itheima.service.impl.LiveServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class LiveAction extends ActionSupport implements ModelDriven<Live>{
	
	private Live live = new Live();
	

	private String date1;
	private String time1;
	private String livedata;//查找一个直播后返回值


	public String getLivedata() {
		return livedata;
	}

	public void setLivedata(String livedata) {
		this.livedata = livedata;
	}

	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	

	

	@Override
	public Live getModel() {
		// TODO Auto-generated method stub
		return live;
	}
	public Live getLive() {
		return live;
	}

	public void setLive(Live live) {
		this.live = live;
	}
	
	/*
	 * 直播列表的查询
	 */
	public String findAllLive(){
		LiveService liveService = new LiveServiceImpl();
		List<Live> livelist = liveService.findAllLive();
		//进行判断，然后展示
		for (int i = 0; i < livelist.size(); i++) {
			String index = String.valueOf(livelist.get(i).getStatus());
			if("0".equals(index)){
				livelist.get(i).setStatus_mc("未播");
			}else if("1".equals(index)){
				livelist.get(i).setStatus_mc("直播中");
			}
		}
		
		
		int len = livelist.size()+1;
		int size = 10;
		int page = len/size + 1; 
		//将值存入到值栈中
		ActionContext.getContext().getValueStack().set("list", livelist);
		ActionContext.getContext().getValueStack().set("totle", len);
		ActionContext.getContext().getValueStack().set("size", size);
		ActionContext.getContext().getValueStack().set("page", page);
		return "findAllSuccess";
	}
	/*
	 * 新增直播
	 */
	public String addLive(){
		
		User existUser = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		live.setCreate_by(existUser.getName());
		System.out.println("date1:"+date1);
		//System.out.println("time1:"+time1);
		
		
		
		//直播的时间要写明白
		//Timestamp dates =(Timestamp)date1;
		//Timestamp data = new Timestamp.valueOf(data1)
		//live.setDate()
		
		
		LiveService liveService = new LiveServiceImpl();
		liveService.addLive(live);
		
		
		
		return NONE;
	}
	/*
	 * 开启直播
	 */
	public String openLive(){
		
		
		HttpServletRequest request = ServletActionContext.getRequest();
		Long userid = Long.valueOf(request.getParameter("userid"));
		//HttpServletRequest request = ServletActionContext.getRequest();
		Long liveid = Long.valueOf(request.getParameter("liveid"));
		//获取状态码
		String status = (String)request.getParameter("livestatus");
		//获取当前用户,如果当前用户为管理员可以开启，如果不是，但是和userid一直的话，可以开启
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		
		if(user.getLevel().equals(Long.valueOf("0"))||user.getUser_id().equals(userid)){
			LiveService liveService = new LiveServiceImpl();
			liveService.openLive(liveid);
			return "openSuccess";
		}else if(status.equals("1")){
			//正在直播中,不能开启
			this.addActionError("不好意思，正在直播中，您不能再次开启直播！");
			
			return "openFaile";
		}else{
			//权限不足
			this.addActionError("不好意思，您的权限不够！");
			
			return "openFaile";
		}
		
		
		
		
	}
	/*
	 * 关闭直播
	 */
	public String closeLive(){
		HttpServletRequest request = ServletActionContext.getRequest();
		Long userid = Long.valueOf(request.getParameter("userid"));
		//HttpServletRequest request = ServletActionContext.getRequest();
		Long liveid = Long.valueOf(request.getParameter("liveid"));
	
		//获取当前用户,如果当前用户为管理员可以开启，如果不是，但是和userid一直的话，可以开启
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		//先判断
		if(user.getLevel().equals(Long.valueOf("0"))||user.getUser_id().equals(userid)){
			LiveService liveService = new LiveServiceImpl();
			liveService.closeLive(liveid);
			return "closeSuccess";
		}else {
			//权限不足
			this.addActionError("不好意思，您的权限不够！");
			
			return "closeFaile";
		}
		
		
	}
	public String findOne(){
		
		//System.out.println("liveid:"+live.getIdSring());
		System.out.println("id:"+live.getId());
		//String id = live.getIdSring();
		LiveService liveService = new LiveServiceImpl();
		Live findone = liveService.findOne(live.getId());
		Gson gson = new Gson();
		 livedata = gson.toJson(findone);//注意不要使用String livedata
		System.out.println(livedata);
		return "findOneliveSuccess";
		
	}
	
	

}
