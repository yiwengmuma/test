package com.atguigu.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HelloWorld helloWorld = new HelloWorld();
//		helloWorld.setName("����");
		//1.����spring��IOC��������
		//ApplicationContext����IOC��������һ���ӿ�
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		//2.��IOC�л�ȡbeanʵ��
		//HelloWorld helloWorld = (HelloWorld)ctx.getBean("helloWorld2");
		//3.����hello����
		helloWorld.hello();
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person= (Person) ctx.getBean("person");
		System.out.println(person);
		
		person= (Person) ctx.getBean("person2");
		System.out.println(person);
		
		person= (Person) ctx.getBean("person3");
		System.out.println(person);
	}

}
