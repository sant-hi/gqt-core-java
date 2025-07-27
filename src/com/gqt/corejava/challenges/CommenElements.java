package com.gqt.corejava.challenges;
import java.util. HashSet;

import java.util.Set;
public class CommenElements {
		public static void main(String[] args) { int[] array1= {1, 2, 3, 4, 5};
		int[] array2 = { 4, 5, 6, 7, 8};
		Set<Integer> set1 = new HashSet<>();
		for (int value: array1) {
		set1.add(value);
		Set<Integer> commonSet = new HashSet();
		for (int value2: array2) {
		if (set1.contains(value)) {
		commonSet.add(value);
		}
		}
		System.out.println("Common elements between arrays: " + commonSet);
		}
	}
}
