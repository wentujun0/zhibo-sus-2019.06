package com.itheima.domain;


import java.util.HashSet;
import java.util.Set;



/**
 * 学院
 * @author l
 *
 */
public class Company {
	private long id;//学院唯一标识号
	private String name;//学院名称
	
	private Set<Office> offices = new HashSet<Office>();
			
	
	public Set<Office> getOffices() {
		return offices;
	}
	public void setOffices(Set<Office> offices) {
		this.offices = offices;
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
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + "]";
	}
	
	
}
