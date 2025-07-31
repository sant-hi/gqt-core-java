package com.gqt.corejava.challengesArrays;
// write a program to print the sum of all elements of an array
import java.util.Scanner;
public class SumofElements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum = "+sum);
	}

}
