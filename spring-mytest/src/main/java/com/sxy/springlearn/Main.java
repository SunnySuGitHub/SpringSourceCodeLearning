package com.sxy.springlearn;

import com.sxy.springlearn.Dao.UserDao;
import com.sxy.springlearn.config.TestConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description:spring
 * Created by Administrator on 2020/4/5
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
	}
}
