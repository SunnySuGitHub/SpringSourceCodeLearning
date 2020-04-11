package com.sxy.springlearn.config;

import com.sxy.springlearn.util.Constants;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Description:spring
 * Created by Administrator on 2020/4/5
 */
//@Component
public class BeanPostProcessorTest implements BeanPostProcessor {


	public BeanPostProcessorTest() {
		System.err.println(Constants.COMMAND_LINE_PREFIX + "BeanPostProcessor init");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if("userService".equals(beanName)) {
			System.out.println(bean);
		}
		System.err.println(Constants.COMMAND_LINE_PREFIX + beanName + "in BeanPostProcessor postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if("userService".equals(beanName)) {
			System.out.println(bean);
		}
		System.err.println(Constants.COMMAND_LINE_PREFIX + beanName + "in BeanPostProcessor postProcessAfterInitialization");
		return bean;
	}
}
