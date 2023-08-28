package com.hsbc.banking.models;

public class Toll {

	public String message() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "toll";
	}
}
