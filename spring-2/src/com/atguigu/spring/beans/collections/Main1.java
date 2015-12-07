package com.atguigu.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
	public static void main(String[] args) {
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = (Person) ctx.getBean("person4");
		
		System.out.println(person);
		
		Person person2 = (Person) ctx.getBean("person6");
		
		System.out.println(person2);
		
		NewPerson person1 = (NewPerson) ctx.getBean("newPerson");
		
		System.out.println(person1);
		
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource);
	}

}
