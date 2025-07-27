package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();
	        
	        for (int i = 0; i < n; i++) {
	            char ch = (char)('A' + i);
	            for (int s = 0; s < n - i - 1; s++) {
	                System.out.print("  ");
	            }
	            for (int j = 0; j < 2 * i + 1; j++) {
	                System.out.print(ch + " ");
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	}