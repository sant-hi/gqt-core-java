package com.gqt.corejava.intoductionChallenges;

public class Secondlarget {
	    public static void main(String[] args) {
	        int arr[] = {10, 20, 4, 45, 99, 6};
	        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
	        for (int n : arr) {
	            if (n > largest) {
	                second = largest;
	                largest = n;
	            } else if (n > second && n != largest) {
	                second = n;
	            }
	        }
	        System.out.println("Second Largest = " + second);
	    }
	}


