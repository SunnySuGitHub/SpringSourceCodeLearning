package com.sxy.springlearn.Service;

import com.sxy.springlearn.Dao.UserDao;
import com.sxy.springlearn.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:spring
 * Created by Administrator on 2020/4/7
 */
//@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public UserService() {
		System.err.println(Constants.COMMAND_LINE_PREFIX + "userService init");
	}

}
