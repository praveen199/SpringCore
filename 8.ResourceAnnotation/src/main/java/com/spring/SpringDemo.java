package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
	public static void main(String[] args)  {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee = ctx.getBean(Employee.class);
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getCompany().getCompName());
	}
}
