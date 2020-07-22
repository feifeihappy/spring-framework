package com.mti.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.io.InputStream;
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

		/**
		 * DefaultListableBeanFactory  是Spring  bean 注册及加载的默认实现。
		 * @description
		 * @author zhaopf@mti-sh.cn
		 * @param: args
		 * @createTime 2020/1/19 9:44
		 */

//		DefaultListableBeanFactory

		/**
		 * XmlBeanDefinitionReader   XML 配置文件 的 读取 是 Spring 中 重要的 功能，因为Spring的大部分功能都是以配置作为切入点的
		 * 中 梳理 一下 资源 文件 读取、 解析 及 注册 的 大致 脉络，
		 * @description
		 * @author zhaopf@mti-sh.cn
		 * @param: args
		 * @createTime 2020/1/19 9:43
		 *
		 */
//		XmlBeanDefinitionReader

//		ResourceLoader
//		BeanDefinitionReader
//		EnvironmentCapable
//		DocumentLoader
//		AbstractBeanDefinitionReader
//		BeanDefinitionDocumentReader
//		BeanDefinitionParserDelegate

		BeanFactory bf = new XmlBeanFactory(new ClassPathResource(" beanFactoryTest. xml"));

		Resource resource = new ClassPathResource(" beanFactoryTest. xml");
		try {
			InputStream inputStream = resource.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}


//		if (this.clazz != null) {
//			is = this.clazz.getResourceAsStream(this.path);
//		} else {
//			is = this.classLoader.getResourceAsStream(this.path);
//		}


//		public InputStream getInputStream () throws IOException {
//			return new FileInputStream(this.file);
//		}


//		public XmlBeanFactory(Resource resource) throws BeansException {
//			//调用 XmlBeanFactory（ Resource, BeanFactory） 构造 方法
//			this(resource, null);
//		}


		List<String> list = new ArrayList<>();
		if (CollectionUtils.isEmpty(list)) {

		}

	}


//	public static void main(String[] args) {
//		ApplicationContext ac =new AnnotationConfigApplicationContext(JavaConfig.class);
//		Hello hello = (Hello)ac.getBean("hello");
//		hello.sayHello();
//	}
}
