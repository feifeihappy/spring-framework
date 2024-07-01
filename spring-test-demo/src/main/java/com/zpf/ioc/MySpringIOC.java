package com.zpf.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description：TODO
 * time：2024/7/1 16:18
 * auther：zhaopengfei
 */
public class MySpringIOC {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Object teacher = context.getBean("teacher");
		System.out.println(teacher.toString());

	}

}
