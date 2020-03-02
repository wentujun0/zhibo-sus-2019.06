package com.itheima.domain;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 直播的domain
 * @author l
 *
 */
public class Live {
	private Long id;
	private String name;//直播展示的名字
	private String password;//直播的密码
	private String description;
	private String create_by;
	private Date create_date;//直播的创建时间
	private Timestamp date;//直播时间
	private String url;//直播的地址
	private String level;
	private Long status;//直播状态
	
	//新增
	private String status_mc;//直播状态名称
	private String idSring;//直播的id号
	
	
	public String getIdSring() {
		return idSring;
	}
	public void setIdSring(String idSring) {
		this.idSring = idSring;
	}
	
	public String getStatus_mc() {
		return status_mc;
	}
	public void setStatus_mc(String status_mc) {
		this.status_mc = status_mc;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
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
	public Long getStatus() {
		return status;
	}
	public void setStatus(Long status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Live [id=" + id + ", name=" + name + ", password=" + password
				+ ", description=" + description + ", create_by=" + create_by
				+ ", create_date=" + create_date + ", date=" + date + ", url="
				+ url + ", level=" + level + ", status=" + status + "]";
	}
	
	
}
