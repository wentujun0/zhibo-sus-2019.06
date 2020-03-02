package com.itheima.web.action;

import org.apache.struts2.ServletActionContext;

import com.itheima.domain.User;
import com.itheima.service.LoginService;
import com.itheima.service.impl.LoginServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginerAction extends ActionSupport  {
	private String oldpassword;
	private String newpassword;
	private String renewpassword;
	
	
	public String getOldpassword() {
		return oldpassword;
	}
	public void setOldpassword(String oldpassword) {
		this.oldpassword = oldpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getRenewpassword() {
		return renewpassword;
	}
	public void setRenewpassword(String renewpassword) {
		this.renewpassword = renewpassword;
	}
	
	//安全退出
	public String logout(){
		
		ActionContext.getContext().getSession().clear();
		
		return "logout";
	}
	//修改密码
	public String updatePassword(){
		System.out.println("开始修改密码");
		//获取现在存在的账号密码
		User existUser = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		//三目运算符，防止空的发生;
		String old = (oldpassword == null) ? "" : oldpassword;
		String news = (newpassword == null) ? "" : newpassword;
		String renews = (renewpassword == null) ? "" : renewpassword;
		System.out.println("oldpassword"+old);
		System.out.println("newpassword"+news);
		System.out.println("renewpassword"+renews);
		//开始进入循环校验
		if("".equals(old) || "".equals(news) || "".equals(renews)){
			
			this.addActionError("存在未输入信息的空的数据框！");
			return "faile";
		}else if(!existUser.getPassword().equals(old)){
			
			this.addActionError("旧密码输入有误!");
			return "faile";
		}else if(!news.equals(renews)){
			this.addActionError("输入两次新密码不一致！");
			return "faile";
		}
		//以上校验没有问题，开始执行下一步
		Long userid = existUser.getUser_id();
		LoginService loginService = new LoginServiceImpl();
		loginService.updatePassword(userid, news);
		
		return "updateSuccess";
	}
}
