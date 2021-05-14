package com.surya.comp;

public final class Fedex implements Courier {

	public Fedex() {
		System.out.println("Fedex::0-param Constructor");
	}

	@Override
	public String deliver(int oid) {

		return "Delivering" + oid + "Order-Id order product using Fedex";
	}

}
