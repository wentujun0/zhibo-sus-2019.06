package com.itheima.servlet;

import java.awt.image.BufferedImage; 
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itcast.bean.CheckCodeBean;
import com.itheima.utils.CheckCodeBox;

@WebServlet("/checkCodeServlet")
public class CheckcodeServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
		
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
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
		 //3.将图片输出到页面展
		ImageIO.write(image,"jpg",response.getOutputStream());
		//request.setAttribute("checkcode", checkdata);
		request.getSession().setAttribute("checkcode", checkdata);
		
	}

}
