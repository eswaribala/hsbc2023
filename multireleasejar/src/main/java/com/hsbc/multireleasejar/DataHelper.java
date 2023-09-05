package com.hsbc.multireleasejar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataHelper {
	
    public static boolean checkIfLeapYear(String dateStr) throws Exception {
        System.out.println("Checking for leap "
        		+ "year using Java 1 calendar API ");

        Calendar cal = Calendar.getInstance();
        cal.setTime(new SimpleDateFormat("yyyy-MM-dd")
        		.parse(dateStr));
        int year = cal.get(Calendar.YEAR);

        return (new GregorianCalendar()).isLeapYear(year);
    }
	
}
