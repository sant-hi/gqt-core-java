package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {
	            char startChar = (char) ('A' + 2 * i);
	            for (int s = 0; s < n - i - 1; s++) {
	                System.out.print("  "); 
	            }
	            for (char ch = startChar; ch >= 'A'; ch--) {
	                System.out.print(ch + " ");
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	}

