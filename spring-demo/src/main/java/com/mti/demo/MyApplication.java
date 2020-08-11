package com.mti.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	/**
	 * @description
	 * @author zhaopf@mti-sh.cn
	 * @createTime 2020/1/15 16:45
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application_context.xml");
		Hello hello = (Hello) ac.getBean("hello");
		hello.sayHello();

	}

}
