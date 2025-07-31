package com.gqt.corejava.challengesArrays;
import java.util.Scanner;
public class Product13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		long pdt=1;
		for(int i=0;i<n;i++) {
			pdt=pdt*arr[i];
		
		}
		System.out.println("Product="+pdt);
	}

}
