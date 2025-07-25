package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Take user input
		        System.out.print("Enter number of rows: ");
		        int rows = scanner.nextInt();

		        System.out.print("Enter number of dashes (-): ");
		        int dashes = scanner.nextInt();

		        System.out.print("Enter number of hashes (@): ");
		        int hashes = scanner.nextInt();

		        // Generate pattern
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < dashes; j++) {
		                System.out.print("-");
		            }
		            for (int k = 0; k < hashes; k++) {
		                System.out.print("@");
		            }
		            System.out.println();
		        }

		        scanner.close();
		    }
		
	}


