package com.hsbc.java9to11demo.facades;

import java.util.Random;

@FunctionalInterface
public interface OTPGenerator {

	short getOTP(int seed);
	public static int generateOTP() {
		return new Random().nextInt(9999);
	}
	
}
