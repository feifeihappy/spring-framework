package com.mti.demo.model;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月31日
 */
public class Car {



	private int maxSpeed ;
	private double price ;
	private String brand ;
	private String color;


	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car{" +
				"maxSpeed=" + maxSpeed +
				", price=" + price +
				", brand='" + brand + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
