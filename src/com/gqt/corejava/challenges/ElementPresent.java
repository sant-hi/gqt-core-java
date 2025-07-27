package com.gqt.corejava.challenges;

public class ElementPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};

		int searchElement = 3;
		boolean found = false;

		for (int value: array) { 
			if (value == searchElement) {
				found = true; break; 
			}
		}

		if (found) {

		System.out.println(searchElement + " is present in the array.");

		} else {
			System.out.println(searchElement + " is not present in the array.");
		}
	}

}
