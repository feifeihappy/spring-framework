package com.zpf.ioc.desigon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * description：TODO
 * time：2024/7/1 16:29
 * auther：zhaopengfei
 */
// 发布事件，可以通过ApplicationEventPublisher  的 publishEvent() 方法发布消息。
//@Component
public class DemoPublisher {

	@Resource
	ApplicationContext applicationContext;

	public void publish(String message){
		//发布事件
		applicationContext.publishEvent(new DemoEvent(this, message));
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DemoPublisher demoPublisher = (DemoPublisher) context.getBean("demoPublisher");
		demoPublisher.publish("11");
	}
}
