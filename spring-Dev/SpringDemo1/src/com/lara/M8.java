package com.lara;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M8
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // this is interface 
		System.out.println("Bean factory readdy");
		Employee e1  = (Employee ) bf.getBean("e2");
		System.out.println("Employee object e2s is readdy");
		String s1 = e1.getfname();
		System.out.println(s1);
		int i1 = e1.getAge();
		System.out.println(i1);
		System.out.println("getSucess()");
	}
}
// some time it required object without data 