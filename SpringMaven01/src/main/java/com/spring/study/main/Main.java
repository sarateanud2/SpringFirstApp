package com.spring.study.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.study.robotconst.T1000;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		T1000 t1000 = (T1000) context.getBean("t1000");
		t1000.robotInfo();

	}

}
