package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();

		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= rows - i + 1; j++) {
		                System.out.print("-");
		            }

		            for (int j = 1; j <= i; j++) {
		                System.out.print("#");
		            }

		            System.out.println();
		        }

		        scanner.close();
		    }
		}

