package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System .out.println("enter the size:");
	        int n = sc.nextInt(); 
	       
	      
	        for (int i = 1; i <= n; i++) {
	            System.out.print(" ".repeat(n - i));
	            System.out.print(i);
	            if (i != 1) {
	                System.out.print(" ".repeat(2 * i - 3));
	                System.out.print(i);
	            }
	            System.out.println();
	        }

	       
	        for (int i = n - 1; i >= 1; i--) {
	            System.out.print(" ".repeat(n - i));
	            System.out.print(i);
	            if (i != 1) {
	                System.out.print(" ".repeat(2 * i - 3));
	                System.out.print(i);
	            }
	            System.out.println();
	        }

	        sc.close();
	    }
	}

