package com.itheima.domain;
/**
 * 系
 * @author l
 *
 */
public class Office {
	private long oid;//唯一标识符，主键
	private long id;
	private String name;
	private long company_id;
	//系是多的一方，放置一 的一方的类
	private Company company;
	
	public Company getCompany() {
		return company;
	}
	
	
	public long getOid() {
		return oid;
	}


	public void setOid(long oid) {
		this.oid = oid;
	}


	public void setCompany(Company company) {
		this.company = company;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(long company_id) {
		this.company_id = company_id;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Office [id=" + id + ", name=" + name + ", company_id="
				+ company_id + "]";
	}
	
	
	
}
