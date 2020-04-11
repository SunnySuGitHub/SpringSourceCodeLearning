package com.sxy.springlearn.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:spring
 * Created by Administrator on 2020/4/8
 */
@Component
public class B {

	@Autowired
	A a;

	public B () {
		System.out.println("B init");
	}
}
