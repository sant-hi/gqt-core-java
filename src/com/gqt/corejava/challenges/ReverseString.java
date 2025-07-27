package com.gqt.corejava.challenges;

public class ReverseString {

	public static void main(String[] args) {
			int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};

			int maxEndingHere = array[0];

			int maxSoFar = array[0];
			for (int i = 1; i < array.length; i++) {

			maxEndingHere = Math.max(array[i], maxEndingHere + array[i]); maxSoFar = Math.max(maxSoFar, maxEndingHere);

			}

			System.out.println("Largest sum of subarray: " + maxSoFar);
	}

}
