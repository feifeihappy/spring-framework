package com.mti.demo.model;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月31日
 */
public class Persons {
	private String name;
	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", 拥有一辆car=" + car +
				'}';
	}
}
