package com.gqt.corejava.intoductionChallenges;

public class LeapYear {
	    public static void main(String[] args) {
	        int year = 2024;
	        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	        System.out.println(year + (leap ? " is Leap Year" : " is Not Leap Year"));
	    }
	}


