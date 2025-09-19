package com.gqt.corejava.DataTypeChallenges;
public class maxminArray {
	public static void main(String[] args) {
		 int[] arr = {3, 7, 1, 9, 2};
	        int min = arr[0], max = arr[0];
	        for (int n : arr) {
	            if (n < min) min = n;
	            if (n > max) max = n;
	        }
	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
	}

}
