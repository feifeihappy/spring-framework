package com.mti.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * @author zhaopf@mti-sh.cn
 * @Description TODO
 * @createTime 2020年07月30日
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor, Ordered {
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
		System.out.println("对容器进行处理后。。。。。");
	}

	@Override
	public int getOrder() {
		return 1;
	}
}
