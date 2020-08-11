package com.mti.demo;

import com.mti.demo.model.CarFactoryBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月31日
 */
public class BeanFactoryTest {
//
//	@Test
//	public void getCar(){
//		ClassPathResource resource = new ClassPathResource("beans.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//
//		Car car = (Car) beanFactory.getBean("car");
//		System.out.println(car);
//	}
//
//	@Test
//	public void getCars() throws Exception {
//		ClassPathResource resource = new ClassPathResource("beans.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//
//		Car car = (Car) beanFactory.getBean("carFactoryBean");
//		System.out.println(car);
//		CarFactoryBean carFactoryBean = (CarFactoryBean) beanFactory.getBean("&carFactoryBean");
//		System.out.println(carFactoryBean.getObject());
//		System.out.println(carFactoryBean);
//	}
}
