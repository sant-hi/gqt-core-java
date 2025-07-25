package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elements in the first row: ");
		        int rows = scanner.nextInt();

		        int number = 1;

		        for (int i = rows; i >= 1; i--) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print(number++ + "	 ");
		            }
		            System.out.println();
		        }

		        scanner.close();
		    }
		}

