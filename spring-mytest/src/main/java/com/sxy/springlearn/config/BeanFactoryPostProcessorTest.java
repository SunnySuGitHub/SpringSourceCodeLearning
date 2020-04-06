package com.sxy.springlearn.config;

import com.sxy.springlearn.util.Constants;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * Description:spring
 * Created by Administrator on 2020/4/5
 */
@Component
public class BeanFactoryPostProcessorTest implements BeanFactoryPostProcessor {

	public BeanFactoryPostProcessorTest() {
		System.err.println(Constants.COMMAND_LINE_PREFIX + "BeanFactoryPostProcessor init");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.err.println(Constants.COMMAND_LINE_PREFIX + "postProcessBeanFactory execute");
	}
}
