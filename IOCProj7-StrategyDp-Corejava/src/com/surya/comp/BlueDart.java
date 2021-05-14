package com.surya.comp;

public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart::0-param Constructor");
	}

	@Override
	public String deliver(int oid) {

		return "Delivering" + oid + "Order-Id order product using BlueDart";
	}

}
