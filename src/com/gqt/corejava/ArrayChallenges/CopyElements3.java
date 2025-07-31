package com.gqt.corejava.ArrayChallenges;
import java.util.Scanner;
public class CopyElements3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		 System.out.print("Elements: ");
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        for (int i = 0; i < n; i++) {
	            b[i] = a[i];
	        }
	        System.out.print("Copied array: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(b[i] + " ");
	        }
	    }
	}
	


