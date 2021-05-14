package com.surya.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.surya.comp.Flipkart;

public class StrategyDpTest {

	public static void main(String[] args) {
		//create IOC container 
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new  XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/surya/cfgs/applicationContext.xml");
		//get target class object
		Flipkart fpkt = factory.getBean("fpkt",Flipkart.class);
		//invoke the b.method
		String result=fpkt.shopping(new String[] {"mangoes", "tamarind","sugarcane"},
				                     new float[] {900.0f,300.0f,100.0f} );
		
           System.out.println(result);
           
	}

}
 