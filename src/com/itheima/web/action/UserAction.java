package com.itheima.web.action;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.apache.struts2.ServletActionContext;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import com.itheima.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 用户的Action的类
 * @author jt
 *
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
	// 接收数据:模型驱动的方式
	private User user = new User();
	@Override
	public User getModel() {
		return user;
	}
	
	private String check;//本人输入
	
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	/**
	 * 用户登录的方法:
	 * @throws OgnlException 
	 */
	public String login() throws OgnlException{
		//System.out.println("可以运行到这来"+user);
		// 调用业务层:
		
		//OgnlContext context = new OgnlContext();
		//Object root = context.getRoot();
		
		//String checkcode = (String)Ognl.getValue("#checkcode", context, root);
		
		
	//	System.out.println("login()里面的checkcode:"+checkcode);
		HttpServletRequest request = ServletActionContext.getRequest();
		String checkcode = (String)request.getParameter("checkcode");
		System.out.println("login()开始调用业务层");
		System.out.println("login()本人输入的check:"+check);
		System.out.println("默认的checkcode"+checkcode);
		
		//if(checkcode.equals(check)){
	//		this.addActionError("抱歉，您的验证码输入错误！");
	//		return LOGIN;
	//	}	
		UserService userService = new UserServiceImpl();
		User existUser = userService.login(user);
		// 根据结果页面跳转：
		
		 if(existUser == null){
			// 登录失败
			// ActionError、FieldError、ActionMessage
			this.addActionError("用户名或密码错误！");
			return LOGIN;
		}else{
			// 登录成功
			// ActionContext.getContext().getSession().put("existUser", "existUser");
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			return SUCCESS;
		}
	}
	/**
	 * 查询教师用户列表
	 */
	public String findAllUser(){
		
		UserService userService = new UserServiceImpl();
		List<User> userlist = userService.findAllUser();
		int len = userlist.size()+1;
		int size = 10;
		int page = len/size + 1; 
		//将值存入到值栈中
		ActionContext.getContext().getValueStack().set("list", userlist);
		ActionContext.getContext().getValueStack().set("totle", len);
		ActionContext.getContext().getValueStack().set("size", size);
		ActionContext.getContext().getValueStack().set("page", page);
		
		return "findAllSuccess";
		
	}
	/**
	 * 增加用户
	 */
	public String addUser(){
		
		//先进行校验
		String uname = (user.getUsername() == null) ? "" : user.getUsername();
		String upassword = (user.getPassword() == null) ? "" : user.getPassword();
		String name = (user.getName() == null) ? "" : user.getName();
		String no = (user.getNo() == null) ? "" : user.getNo();
		String phone = (user.getPhone() == null) ? "" : user.getPhone();
		String email = (user.getEmail() == null) ? "" : user.getEmail();
		//
		//进行校验
		
		//测试
		//System.out.println("company:"+user.getCompany_id());
		//System.out.println("office:"+user.getOffice_id());
		
		
		
		if("".equals(uname) || "".equals(upassword) || "".equals(name) || "".equals(no) ){
			
			this.addActionError("存在空选项，请重新输入！");
			return "addFaile";
			
		}
		
		UserService userService = new UserServiceImpl();
		User addUser = userService.addUser(user);
		if(addUser != null){
			return "addSuccess";
		}else{
			this.addActionError("注册失败，请重新输入！");
			return "addFaile";
		}
		
		
	}
	
	
	/**
	 * 删除用户
	 * 
	 */
	
	public String delete(){
		//需要查询一个request中的parameter和attribute的区别
		HttpServletRequest request = ServletActionContext.getRequest();
		String userid = (String)request.getParameter("userid");
		UserService userService = new UserServiceImpl();
		userService.deleteUser(userid);
		return "deleteSuccess";
	}

}
