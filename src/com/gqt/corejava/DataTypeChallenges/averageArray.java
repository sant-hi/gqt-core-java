package com.gqt.corejava.DataTypeChallenges;

public class averageArray {

	public static void main(String[] args) {
		 int[] arr = {2, 4, 6, 8, 10};
	        int sum = 0;

	        for (int n : arr) sum += n;

	        double avg = (double) sum / arr.length;
	        System.out.println("Average: " + avg);

	}

}
