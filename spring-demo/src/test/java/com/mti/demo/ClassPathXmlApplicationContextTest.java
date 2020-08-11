package com.mti.demo;

import com.mti.demo.dao.UserDao;
import com.mti.demo.model.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月30日
 */
public class ClassPathXmlApplicationContextTest {

	@Test
	public void file() {

			//使用BeanFactory方式加载XML.虽然XmlBeanFactory在Spring 3.1中被标记为不建议使用，但是不影响我们分析源码
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application_context.xml"));

			//使用ApplicationContext方式加载XML.
		ApplicationContext bfs = new ClassPathXmlApplicationContext("application_context.xml");
	}

	@Test
	public void constructor() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");

			//经测试，第二个参数并无指定性的作用，所以就算换一个class也可以
		ApplicationContext contexts = new ClassPathXmlApplicationContext("/application_context.xml", User.class);
	}


	@Test
	public void MyBean(){
		//解析application_context.xml文件 , 生成管理相应的Bean对象
		ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");

		System.out.println(context.getParent());//输出结果null
		User user = (User) context.getBean("user");
		System.out.println(user);
	}


	@Test
	public void MyBeans(){
		//解析application_context.xml文件 , 生成管理相应的Bean对象
		//        ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");

		//自定义一个系统属性，名为 spring 值为配置文件全名
		System.setProperty("spring","application_context");
		//使用占位符设置配置文件路径
		ApplicationContext context = new ClassPathXmlApplicationContext("${spring}.xml");
		System.out.println(context.getParent());
		System.out.println(context.getEnvironment());
		System.out.println(context.getClassLoader());
		User user = (User) context.getBean("user");
		System.out.println(user);

	}


	@Test
	public void MyBeanss(){

		ApplicationContext context = new ClassPathXmlApplicationContext("/application_context.xml", UserDao.class);
		//System.setProperty("spring","application_context");
		//ApplicationContext context = new ClassPathXmlApplicationContext("/${spring}.xml", UserDao.class);	//调用失败
		System.out.println(context.getParent());
		System.out.println(context.getEnvironment());
		System.out.println(context.getClassLoader());
		User user = (User) context.getBean("user");
		System.out.println(user);

	}


}
