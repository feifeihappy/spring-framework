package com.mti.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class MyApplication {
	/**
	 * @description
	 * @author zhaopf@mti-sh.cn
	 * @createTime 2020/1/15 16:45
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello hello = (Hello) ac.getBean("hello");
		hello.sayHello();

		List<String> list = new ArrayList<>();
		if (CollectionUtils.isEmpty(list)) {

		}

	}

}
