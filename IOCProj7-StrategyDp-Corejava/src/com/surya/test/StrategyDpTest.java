package com.surya.test;

import com.surya.Factory.FlipkartFactory;
import com.surya.comp.Flipkart;

public class StrategyDpTest {

	public static void main(String[] args) {
		// Get Target class object  having Dependent class object.
		Flipkart fpkt = FlipkartFactory.getInstance("dtdc");
		//Invoke b.method
		String result = fpkt.shopping(new String[] {"shirt","trouser","watch"},
				                      new float[] {4000.0f,6000.0f,30000.0f});
		System.out.println(result);
		

	}

}
