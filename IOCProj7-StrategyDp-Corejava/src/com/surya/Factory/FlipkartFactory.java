package com.surya.Factory;

import com.surya.comp.BlueDart;
import com.surya.comp.Courier;
import com.surya.comp.DTDC;
import com.surya.comp.Flipkart;

public class FlipkartFactory {

	// static fatcory method haing factory pattern logic.
	public static Flipkart getInstance(String courierType) {
	   
		//Create  Dependent class obj
		Courier courier = null;
		if (courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (courierType.equalsIgnoreCase("bDart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid Courier type");

		//create Target class obj
		Flipkart fpkt = new Flipkart();
		//Assign Dependent class obj to target class object
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}
