package com.surya.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.surya.beans.Robot;

public class RequiredAnnotationTest {

	public static void main(String[] args) {
		//create IOC Container 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/surya/cfgs/applicationContext.xml");
		//get bean
		Robot robot1 = ctx.getBean("robot", Robot.class);
		System.out.println(robot1);
		
	
	} //main
	

} //class
