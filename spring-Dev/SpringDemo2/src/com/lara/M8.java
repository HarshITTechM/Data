package com.lara;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M8
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
		System.out.println(1);
		Book b1 = (Book) appContext.getBean("b2"); 
		System.out.println(b1.getTitle());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
	}
}