package com.mti.demo.model;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月31日
 */
public class CarFactoryBean implements FactoryBean<Car> {
	private String carInfo;
	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.valueOf(infos[1]));
		car.setPrice(Double.valueOf(infos[2]));
		return car;
	}

	@Override
	public Class<Car> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
