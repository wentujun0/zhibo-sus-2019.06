package com.itheima.domain;

import java.sql.Date;

/**
 * 视频的domain
 * @author l
 *
 */
public class Video {

	private Long id;//唯一标识符
	private String name;//展示的名字
	private String realname;//真实的名字
	private String description;//上传介绍
	private Long create_by;//上传人的名字
	private Date create_date;//创建的时间
	private String url;//存储真实路径
	private String level;//类型
	
	//新增idString
	private String idString;
	
	
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCreate_by() {
		return create_by;
	}
	public void setCreate_by(Long create_by) {
		this.create_by = create_by;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Video [id=" + id + ", name=" + name + ", realname=" + realname
				+ ", description=" + description + ", create_by=" + create_by
				+ ", create_date=" + create_date + ", url=" + url + ", level="
				+ level + "]";
	}
	
	
	
}
