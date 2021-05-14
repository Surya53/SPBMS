package com.surya.Factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.surya.comp.Courier;
import com.surya.comp.Flipkart;

public class FlipkartFactory {

	private static Properties props;
	static {
		try {
			//Load properties file
			InputStream is = new FileInputStream("src/com/surya/commons/inputs.properties");
			//Load properties file content into java.util.properties class object
			props = new Properties();
			props.load(is);
		}
		catch(IOException ioe)
		{
		ioe.printStackTrace();	
		}
	}
	// static fatcory method haing factory pattern logic.
	public static Flipkart getInstance() {
	   
		try {
			
		
		//get dependent class name (courier name) from properties file(java.util. Properties class obj
		String courierClassName=props.getProperty("courier.type");
		//Load  & cerate dependent class
		Class c = Class.forName(courierClassName);
	   // Courier courier = (Courier)c.newInstance(); //deprecated from java9
		Constructor cons[] = c.getDeclaredConstructors();
		 Courier courier = (Courier)cons[0].newInstance();
		
	   //create Target class obj
		Flipkart fpkt = new Flipkart();
		//Assign Dependent class obj to target class object
		fpkt.setCourier(courier);
		return fpkt;
		}//try
		
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
			return null;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
	}//method

}
