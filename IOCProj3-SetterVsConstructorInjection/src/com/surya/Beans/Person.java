package com.surya.Beans;

public class Person {
   //Spring bean properties
	private int pid;
	private String pname;
	private String paddr;
	private float income;
	public Person(int pid, String pname, String paddr, float income) {
        System.out.println("4-param constructor");
		this.pid = pid;
		this.pname = pname;
		this.paddr = paddr;
		this.income = income;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + ", income=" + income + "]";
	}
  
	
	
}
