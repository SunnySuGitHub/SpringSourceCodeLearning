package com.sxy.springlearn.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Description:spring
 * Created by Administrator on 2020/4/7
 * 执行顺序
 * 		BeanFactoryPostProcessor
 * 		InstantiationAwareBeanPostProcessor postProcessBeforeInstantiation
 * 		Bean自身构造器
 * 		InstantiationAwareBeanPostProcessor postProcessAfterInstantiation
 * 		BeanPostProcessor postProcessBeforeInitialization
 * 		PostConstruct
 * 		BeanPostProcessor postProcessAfterInitialization
 */
@Component
public class InstaAwareTest implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInstantiation ======> " + beanName);
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInstantiation ======> " + beanName);
		// 下面返回false会导致@Autowired注入失败
//		if (!ibp.postProcessAfterInstantiation(bw.getWrappedInstance(), beanName)) {
//			return; 直接return，跳过后面的依赖注入环节
//		}
		return true;
	}
}
