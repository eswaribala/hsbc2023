package com.hsbc.multireleasejar;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String dateToCheck = args[0];
	        boolean isLeapYear;
			try {
				isLeapYear = DataHelper
						.checkIfLeapYear(dateToCheck);
				System.out.println("Date given " + dateToCheck + " is leap year: " + isLeapYear);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       
	}

}
