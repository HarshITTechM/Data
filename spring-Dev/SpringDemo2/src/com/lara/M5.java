package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M5 
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(1);
		Student s1 = (Student) appContext.getBean("st1");
		System.out.println(2);
		System.out.println(s1.getFname());
		System.out.println(3);
		System.out.println(s1.getLname());
		appContext.registerShutdownHook();
	}
}
