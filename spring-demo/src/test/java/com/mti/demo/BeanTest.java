package com.mti.demo;

import com.mti.demo.model.Car;
import com.mti.demo.model.Persons;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月31日
 */
public class BeanTest {

	@Test
	public void inheritTest(){
		ClassPathResource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Car car1 = (Car) beanFactory.getBean("car1");
		System.out.println(car1);

		Car car2 = (Car) beanFactory.getBean("car2");
		System.out.println(car2);
	}


	@Test
	public void relyTest(){
		ClassPathResource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Car car1 = (Car) beanFactory.getBean("car1");
		System.out.println(car1);
		Persons person = (Persons) beanFactory.getBean("persons");
		System.out.println(person);
	}


}
