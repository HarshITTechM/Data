package com.lara;//here we are changing the order of attribute in config.xml file as e2
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.ClassPathResource;
@SuppressWarnings("deprecation")
public class M7
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("config.xml");
		BeanFactory bf = new XmlBeanFactory(cpr); // this is interface 
		System.out.println("Bean factory readdy");
		Employee e1  = (Employee ) bf.getBean("e2");
		System.out.println("Employee object E1 is readdy");
		String s1 = e1.getfname();
		System.out.println(s1);
		int i1 = e1.getAge();
		System.out.println(i1);
		System.out.println("getSucess()");
	}
}
// some time it required object without data 