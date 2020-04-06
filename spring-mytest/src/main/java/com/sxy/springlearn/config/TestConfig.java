package com.sxy.springlearn.config;

import com.sxy.springlearn.util.Constants;
import org.springframework.context.annotation.ComponentScan;


/**
 * Description:spring
 * Created by Administrator on 2020/4/5
 */
@ComponentScan("com.sxy.springlearn")
public class TestConfig {
	public TestConfig() {
		System.err.println(Constants.COMMAND_LINE_PREFIX + "testConfig init");
	}
}
