package com.mti.demo;

import com.mti.demo.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description：TODO
 * time：2025/5/9 10:06
 * auther：zhaopengfei
 */
public class Test {
	@org.junit.Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.getBean("userDaoImpl");
	}
}
