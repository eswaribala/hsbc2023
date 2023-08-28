package com.hsbc.banking.models;

public class Customer extends Person implements Runnable{

	public Customer(String adharCardNo, String name) {
		super(adharCardNo, name);
		// TODO Auto-generated constructor stub
		System.out.println(Thread.currentThread().getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.adharCardNo+","+this.name);
	}

}
