package com.surya.beans;

import java.util.Date;

public class WishMessageGenerator {

	private Date date;

	public WishMessageGenerator(Date date) {
		System.out.println("1-param Constructor");
		this.date = date;
	}

	public void setDate(Date date)
	{
		System.out.println("WishMessageGenerator::Setter method");
		this.date = date;
	}
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()::" +date);
		int hour = date.getHours();
		if (hour < 12)
			return "GM::" + user;
		else if (hour < 16)
			return "GA::" + user;
		else if (hour < 20)
			return "GE::" + user;
		else
			return "GN::" + user;
	}

}
