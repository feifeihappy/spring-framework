package com.zpf.ioc;

/**
 * description：TODO
 * time：2024/7/1 16:21
 * auther：zhaopengfei
 */
public class Teacher {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"name='" + name + '\'' +
				'}';
	}

}
