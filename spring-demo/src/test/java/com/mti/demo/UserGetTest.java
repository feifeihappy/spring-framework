package com.mti.demo;

import com.mti.demo.service.UserService;
import com.mti.demo.service.impl.UserServiceImpl;
import org.junit.Test;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月30日
 */
public class UserGetTest {
	@Test
	public void getUser(){
		UserService userService = new UserServiceImpl();
		userService.getUser();
	}
}
