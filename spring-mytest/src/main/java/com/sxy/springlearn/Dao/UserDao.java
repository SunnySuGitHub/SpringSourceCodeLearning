package com.sxy.springlearn.Dao;

import com.sxy.springlearn.util.Constants;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * Description:spring
 * Created by Administrator on 2020/4/5
 */
@Repository
public class UserDao {

	public UserDao() {
		System.err.println(Constants.COMMAND_LINE_PREFIX + "userDao init");
	}

	@PostConstruct
	public void post() {
		System.err.println(Constants.COMMAND_LINE_PREFIX + "userDao post construct");
	}


}
