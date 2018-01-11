package com.qf.pojo.po;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("18")
	private Integer id;
	@Value("少糖小姐")
	private String  name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		System.out.println("我来啦");
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
