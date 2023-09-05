package com.hsbc.multireleasejar9;

import java.time.LocalDate;

public class DataHelper {
    public static boolean checkIfLeapYear(String dateStr) throws Exception {
        System.out.println("Checking for leap year using Java 9 Date Api");
        return LocalDate.parse(dateStr).isLeapYear();
    }
}