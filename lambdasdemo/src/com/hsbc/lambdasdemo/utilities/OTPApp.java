package com.hsbc.lambdasdemo.utilities;

import java.util.Random;

import com.hsbc.lambdasdemo.facades.OTPGenerator;

public class OTPApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//define lambda
		OTPGenerator otpGen=()->{
			return (short) (1000+new Random().nextInt(999));
		};		
		//invoke the lambda
		System.out.println(otpGen.getOTP());
		
		
		
	}

}
