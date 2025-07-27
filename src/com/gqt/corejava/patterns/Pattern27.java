 package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows:");
		        int n = sc.nextInt();

		        for (int i = 1; i <= n; i++) {
		            // Print spaces
		            for (int j = 1; j<=n - i; j++) {
		                System.out.print(" ");
		            }

		            // Print number (odd times: 1, 3, 5...)
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print(i);
		            }

		             // Move to next number
		            System.out.println();
		        }
		    }
		}

	

