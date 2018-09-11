package com.huongdanjava.springinheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Clazz generalClazz = (Clazz) context.getBean("generalClazz");

		System.out.println("\n" + generalClazz.getSchoolName());
	}

}