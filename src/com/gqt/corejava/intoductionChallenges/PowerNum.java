package com.gqt.corejava.intoductionChallenges;

public class PowerNum {
	    public static void main(String[] args) {
	        int base = 2, exp = 5;
	        int result = 1;
	        for (int i = 1; i <= exp; i++) {
	            result *= base;
	        }
	        System.out.println(base + "^" + exp + " = " + result);
	    }
}
