package com.gqt.corejava.challenges;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5};
		int sum=0;
		
		for (int i=0;i<array.length;i++) {
			sum+=array[i];
			
		}
		double average= (double) sum/array.length;
		System.out.println("average of elements in the array="+average);
	}

}
