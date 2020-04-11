package com.sxy.springlearn.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Description:spring
 * Created by Administrator on 2020/4/8
 */
@Component
public class A {

	@Autowired
	B b;

	public A() {
		System.err.println("A init");
	}



}
