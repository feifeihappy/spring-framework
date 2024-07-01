package com.zpf.ioc.desigon;

import org.springframework.context.ApplicationListener;

/**
 * description：TODO
 * time：2024/7/1 16:29
 * auther：zhaopengfei
 */
public class DemoListener implements ApplicationListener<DemoEvent> {

	//使用onApplicationEvent接收消息
	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMessage();
		System.out.println("接收到的信息是："+msg);
	}


}
