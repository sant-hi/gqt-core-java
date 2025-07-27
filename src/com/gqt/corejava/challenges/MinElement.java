package com.gqt.corejava.challenges;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {5,2,8,1,6};
		int min=array[0];
		for (int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("Minimum element in the array is :"+min);
		
	}

}
