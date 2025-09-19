package com.gqt.corejava.challenges;
import java.util.Arrays;
public class IncrementArrayElement {
		public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		int constantValue = 3;
		System.out.println("Original array: " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) 
		array[i] += constantValue;
		System.out.println("Array after incrementing each "
				+ "element by " + constantValue + ":" + Arrays.toString(array));
		}
		}

