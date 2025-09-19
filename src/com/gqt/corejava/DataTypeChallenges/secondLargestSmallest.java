package com.gqt.corejava.DataTypeChallenges;
import java.util.Arrays;
public class secondLargestSmallest {
	public static void main(String[] args) {
		 int[] arr = {5, 8, 2, 1, 9, 7};
	        Arrays.sort(arr);
	        System.out.println("Second Smallest: " + arr[1]);
	        System.out.println("Second Largest: " + arr[arr.length - 2]);
	
	}

}
