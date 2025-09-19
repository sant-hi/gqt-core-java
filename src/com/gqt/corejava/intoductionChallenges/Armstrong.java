package com.gqt.corejava.intoductionChallenges;

public class Armstrong {
	    public static void main(String[] args) {
	        int num = 153, sum = 0, temp = num;

	        while (temp > 0) {
	            int d = temp % 10;
	            sum = sum + (d * d * d); 
	            temp = temp / 10;
	        }

	        if (sum == num) {
	            System.out.println(num + " is Armstrong");
	        } else {
	            System.out.println(num + " is Not Armstrong");
	        }
	    }
	}


