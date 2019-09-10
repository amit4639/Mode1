package com.hcl.department;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MianProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dept.xml");
		DataQueryDao d = (DataQueryDao)ctx.getBean("myDao");
		d.searchDepartment();
	}
}
