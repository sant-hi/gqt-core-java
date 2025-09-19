package com.gqt.corejava.intoductionChallenges;

public class PrimeNum {
	    public static void main(String[] args) {
	    	        int num = 29;
	    	        if (num <= 1) {
	    	            System.out.println(num + " is Not Prime");
	    	        } else {
	    	            int count = 0;
	    	            for (int i = 2; i <= num / 2; i++) {
	    	                if (num % i == 0) {
	    	                    count++;
	    	                    break;
	    	                }
	    	            }
	    	            if (count == 0) {
	    	                System.out.println(num + " is Prime");
	    	            } else {
	    	                System.out.println(num + " is Not Prime");
	    	            }
	    	        }
	    	    }
	    	}

