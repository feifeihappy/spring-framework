package com.mti.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月30日
 */
public class PersonFactoryPostProcessor implements BeanFactoryPostProcessor {
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
		System.out.println("调用PersonFactoryPostProcessor的postProcessBeanFactory方法");
		BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition("person");
		MutablePropertyValues pv = beanDefinition.getPropertyValues();
		if (pv.contains("age")) {
			pv.addPropertyValue("age", "23");
		}
		beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
	}
}

