package com.itheima.utils;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;
import com.itcast.bean.CheckCodeBean;
/**
 * 生成验证码图片的工具类，返回值为一个bean对象，里面包含一个字符串data和一个可以打印的image
 * 传入的参数是 int width;
 * 			int height;
 * @author l
 *
 */
public class CheckCodeBox {
	public static CheckCodeBean checkcode(int width,int height){
	  //CheckCodeBox checkCodeBox = new  CheckCodeBox();
		CheckCodeBean checkCodeBean = new CheckCodeBean();
	  //int width = 100;
        //int height = 50;
        
        String code = "" ;
        //1.创建一对象，在内存中图片(验证码图片对象)
        BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);


        //2.美化图片
        //2.1 填充背景色
        Graphics g = image.getGraphics();//画笔对象
        g.setColor(Color.PINK);//设置画笔颜色
        g.fillRect(0,0,width,height);

        //2.2画边框
        g.setColor(Color.BLUE);
        g.drawRect(0,0,width - 1,height - 1);

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghigklmnopqrstuvwxyz0123456789";
        //生成随机角标
        Random ran = new Random();

        for (int i = 1; i <= 4; i++) {
            int index = ran.nextInt(str.length());
            //获取字符
            char ch = str.charAt(index);//随机字符
            code = code + ch;
            //2.3写验证码
            g.drawString(ch+"",width/5*i,height/2);
        }


        //2.4画干扰线
        g.setColor(Color.GREEN);

        //随机生成坐标点

        for (int i = 0; i < 7; i++) {
            int x1 = ran.nextInt(width);
            int x2 = ran.nextInt(width);

            int y1 = ran.nextInt(height);
            int y2 = ran.nextInt(height);
            g.drawLine(x1,y1,x2,y2);
        }
        //3要把输出流输出到屏幕上
		checkCodeBean.setData(code);
		checkCodeBean.setImage(image);
		
		
		
		return checkCodeBean;
		
	}
	
}
