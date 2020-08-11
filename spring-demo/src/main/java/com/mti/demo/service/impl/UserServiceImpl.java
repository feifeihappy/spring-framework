package com.mti.demo.service.impl;

import com.mti.demo.dao.UserDao;
import com.mti.demo.dao.impl.UserDaoImpl;
import com.mti.demo.service.UserService;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月30日
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	public void getUser() {
		userDao.getUser();
	}
}
