package com.mti.demo.dao.impl;

import com.mti.demo.dao.UserDao;
import com.mti.demo.model.User;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月30日
 */
public class UserDaoImpl implements UserDao {
	public void getUser() {
		User user = new User("hresh");
		System.out.println("从bean中获取到的用户数据为" + user);
	}
}

