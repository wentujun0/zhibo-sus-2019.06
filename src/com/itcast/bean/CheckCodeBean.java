package com.itcast.bean;

import java.awt.image.BufferedImage;
/**
 * 字符串验证码打印的bean类
 * String data;
 * BufferedImage image;
 * @author l
 *
 */
public class CheckCodeBean {
	private String data;
	private BufferedImage image;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public BufferedImage getImage() {
		return image;
	}
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
}
