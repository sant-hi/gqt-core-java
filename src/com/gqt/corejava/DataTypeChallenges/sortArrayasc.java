package com.gqt.corejava.DataTypeChallenges;
import java.util.Arrays;
import java.util.Collections;
public class sortArrayasc {
	public static void main(String[] args) {
		 Integer[] arr = {5, 2, 8, 1, 3};
	        Arrays.sort(arr);
	        System.out.println("Ascending: " + Arrays.toString(arr));
	        Arrays.sort(arr, Collections.reverseOrder());
	        System.out.println("Descending: " + Arrays.toString(arr));
	}
}
