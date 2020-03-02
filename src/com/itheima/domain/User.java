package com.itheima.domain;

import java.sql.Date;

public class User {
	private Long user_id;
	private Long company_id;
	private Long office_id;
	private String username;
	private String password;
	private String name;
	private String no;
	private String email;
	private String phone;
	private String create_by;
	private Date create_time;
	private Long level;
	//新增，院系的名称
	private String companyName;
	private String officeName;
	
	
	
	//院系的名称
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	}
	public Long getOffice_id() {
		return office_id;
	}
	public void setOffice_id(Long office_id) {
		this.office_id = office_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCreate_by() {
		return create_by;
	}
	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Long getLevel() {
		return level;
	}
	public void setLevel(Long level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", company_id=" + company_id
				+ ", office_id=" + office_id + ", username=" + username
				+ ", password=" + password + ", name=" + name + ", no=" + no
				+ ", email=" + email + ", phone=" + phone + ", create_by="
				+ create_by + ", create_time=" + create_time + ", level="
				+ level + "]";
	}
	

}
