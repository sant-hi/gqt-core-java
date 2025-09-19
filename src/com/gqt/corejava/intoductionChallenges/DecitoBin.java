package com.gqt.corejava.intoductionChallenges;

public class DecitoBin {
	    public static void main(String[] args) {
	        int num = 10;
	        String bin = "";
	        while (num > 0) {
	            bin = (num % 2) + bin;
	            num /= 2;
	        }
	        System.out.println("Binary = " + bin);
	    }
	}

