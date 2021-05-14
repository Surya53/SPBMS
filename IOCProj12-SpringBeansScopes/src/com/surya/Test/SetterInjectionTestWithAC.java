package com.surya.Test;

import java.util.Arrays;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.surya.beans.Printer;

public class SetterInjectionTestWithAC {

	public static void main(String[] args) {

		//create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/surya/cfgs/applicationContext.xml");
	
	//get targetBean class object
		/*
     WishMessageGenerator generator1 = factory.getBean("wmg",WishMessageGenerator.class);
     WishMessageGenerator generator2 = factory.getBean("wmg",WishMessageGenerator.class);
      System.out.println(generator1.hashCode()+" "+generator2.hashCode());
      System.out.println("generato1==generator2?"+(generator1==generator2));
	System.out.println("==================================================================");
      WishMessageGenerator generator3 = factory.getBean("wmg1",WishMessageGenerator.class); 
      WishMessageGenerator generator4 = factory.getBean("wmg1",WishMessageGenerator.class);
       System.out.println(generator3.hashCode()+" "+generator4.hashCode());
       System.out.println("generator3==generator4?"+(generator1==generator2));
 	
	//invoke the business method
	String result = generator1.generateWishMessage("surya");
	System.out.println("Result :: "+result); 
	
	
	System.out.println("========================================================================");
	Printer p1 = factory.getBean("p1",Printer.class);
	Printer p11 = factory.getBean("p1",Printer.class);
	System.out.println(p1.hashCode()+" "+p11.hashCode());
	
	System.out.println("========================================================================");
	
	Printer p2 = factory.getBean("p2",Printer.class);
	Printer p22 = factory.getBean("p2",Printer.class);
	System.out.println(p2.hashCode()+" "+p22.hashCode());
	
	System.out.println("beans count::"+factory.getBeanDefinitionCount());
	System.out.println("all beans ids "+Arrays.toString(factory.getBeanDefinitionNames()));
	*/
		
	}

}
