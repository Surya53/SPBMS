package com.surya.beans;

public class Printer {
   //static refernce variaable
	private static Printer INSTANCE;  // Rule 2
	
	//private constructor  Rule 1
	private Printer() {
		System.out.println("Printer:: 0-Param Constructor");
	}
	//public static factory method 3
	public static Printer getInstance()
	{
		if(INSTANCE == null)
			INSTANCE = new Printer();
		return INSTANCE;
	}
    //Business method
	public void print(String msg) {
		System.out.println(msg);
	}
} //class
