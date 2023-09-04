package com.hsbc.lambdasdemo.facades;

import java.util.Random;

@FunctionalInterface
public interface OTPGenerator {

	short getOTP();
	public static int generateOTP() {
		return new Random().nextInt(9999);
	}
	
}
