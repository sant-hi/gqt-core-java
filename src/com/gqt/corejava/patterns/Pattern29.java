package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		           
		            for (int j = 1; j<= n-i; j++) {
		                System.out.print(" ");
		            }

		          
		            for (int j = 1; j <=i; j++) {
		                System.out.print(j);
		            }
		            for (int j = i - 1; j >= 1; j--) {
		                System.out.print(j);
		            }
		           
		            System.out.println();
		        }
		    }
	}


