package com.gqt.corejava.challengesArrays;

import java.util.Scanner;

public class SumNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("enter the size");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the elemnts of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				sum+=arr[i];
			}
			
		}
		System.out.println("Sum="+sum);
	}

}
