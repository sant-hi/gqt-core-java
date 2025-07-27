package com.gqt.corejava.challenges;
import java.util.Arrays;
public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,2,5,6,1};
		int[] uniqueArray = Arrays.stream(array).distinct().toArray();
		System.out.println("Array after removing duplicates:");
		for(int value: uniqueArray) {
			System.out.print(value+"");
		}
	}

}
