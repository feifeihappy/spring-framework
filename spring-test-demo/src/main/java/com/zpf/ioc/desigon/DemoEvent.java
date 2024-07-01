package com.zpf.ioc.desigon;

import org.springframework.context.ApplicationEvent;

/**
 * description：TODO
 * time：2024/7/1 16:28
 * auther：zhaopengfei
 */
public class DemoEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;

	private String message;

	public DemoEvent(Object source,String message){
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
