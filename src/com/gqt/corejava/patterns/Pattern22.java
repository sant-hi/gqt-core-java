package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Input number of rows
		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();

		        int totalChars = rows + 1; // Fixed total characters per row

		        for (int i = 1; i <= rows; i++) {
		            // Print i dashes
		            for (int j = 1; j <= i; j++) {
		                System.out.print("-");
		            }

		            // Print (totalChars - i) hashes
		            for (int j = 1; j <= totalChars - i; j++) {
		                System.out.print("#");
		            }

		            System.out.println(); // Move to next line
		        }

		        scanner.close();
		    }
		}