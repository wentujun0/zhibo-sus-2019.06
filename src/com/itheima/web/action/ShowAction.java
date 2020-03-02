package com.itheima.web.action;

import java.awt.image.BufferedImage; 

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.google.gson.Gson;
import com.itcast.bean.CheckCodeBean;
import com.itheima.dao.ShowDao;
import com.itheima.dao.impl.ShowDaoImpl;
import com.itheima.domain.Company;
import com.itheima.domain.Office;

import com.itheima.utils.CheckCodeBox;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class ShowAction extends ActionSupport implements ModelDriven<Company>{
	
	private Company company = new Company();
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	
	@Override
	public Company getModel() {
		// TODO Auto-generated method stub
		return company;
	}
	
	String returndata;
	


	public String getReturndata() {
		return returndata;
	}
	public String officedata;
	

	public String getOfficedata() {
		return officedata;
	}

	public void setOfficedata(String officedata) {
		this.officedata = officedata;
	}

	public void setReturndata(String returndata) {
		this.returndata = returndata;
	}
	//根据传来的学院的值来查询
	long companyid;
	public long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}
	//新增验证码字符串
	private String checkJson;
	
	
	
	public String getCheckJson() {
		return checkJson;
	}

	public void setCheckJson(String checkJson) {
		this.checkJson = checkJson;
	}

	/**
	 * 展示学院
	 * @return
	 */
	
	public String showCompany(){
		ShowDao showDao = new ShowDaoImpl();
		List<Company> list = showDao.companyList();
		
		/*
		 * Gson转化
		 */
		//提前转换 
		Map<String, Long> map = new HashMap<String, Long>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getName(), list.get(i).getId());
		}
		
		Gson gson = new Gson();
		returndata = gson.toJson(map);
		
		//System.out.println("接收到了company:"+returndata);
		return SUCCESS;
		
	}
	/**
	 * 展示系
	 * @return
	 */
	public String showOffice(){
		System.out.println("目前接收到companmyid:"+companyid);
		ShowDao showDao = new ShowDaoImpl();
		List<Office> list = showDao.officeList(companyid);
		/*
		 * Gson转化
		 */
		//提前转换 
		Map<String, Long> map = new HashMap<String, Long>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getName(), list.get(i).getId());
		}
		
		Gson gson = new Gson();
		officedata = gson.toJson(map);
		
		return "officeSuccess";
	}
	
	public String AddUser(){
		System.out.println("执行了showaction");
		return "showSuccess";
	}
	
	
	/**
	 * 
	 * 前端的验证码
	 * @return
	 */
	
	public String checkCode(){
		System.out.println("============checkAction=========");
		HttpServletResponse response = ServletActionContext.getResponse();
		System.out.println("直播里面的的checkcode");
		int width = 100;
        int height = 28;
		
		CheckCodeBean bean = new CheckCodeBean();
		bean = CheckCodeBox.checkcode(width,height);
		BufferedImage image = null;
		image = bean.getImage();
		System.out.println("打印输出的图片上的字符是："+bean.getData());
		String checkdata = bean.getData();//这就是数字
		for(int i = 0; i<checkdata.length();i++){
			System.out.println("打印="+checkdata.charAt(i));
		}
		//将值存放到request中
		//ServletActionContext.getRequest().setAttribute("checkcode", bean.getData());
		//将值放到session中
		//ServletActionContext.getRequest().getSession().setAttribute("checkcode",bean.getData());
		//将值存入到值栈中
		ActionContext.getContext().getValueStack().set("checkcode", bean.getData());
		//通过ajax传回值
		
		
		
		 //3.将图片输出到页面展
		try {
			ImageIO.write(image,"jpg",response.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
		return NONE;
	}






}
