package com.surya.Test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.surya.beans.WishMessageGenerator;

public class ConstructorinjectionTest {
	public static void main(String[] args) {
       FileSystemResource res =  new FileSystemResource("src/com/surya/cfgs/applicationContext.xml");
       XmlBeanFactory factory = new XmlBeanFactory(res);
       Object obj = factory.getBean("wmg");
       WishMessageGenerator generator = (WishMessageGenerator)obj;
      String result = generator.generateWishMessage("Surya");
      System.out.println("Result ::"+result);
	}
}
