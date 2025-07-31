package com.gqt.corejava.ArrayChallenges;
import java.util.Scanner;
public class LowTriSum {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
		        System.out.print("Size of square matrix (n): ");
		        int n = sc.nextInt();
		        int[][] a = new int[n][n];
		        System.out.println("Enter matrix:");
		        for (int i = 0; i < n; i++)
		            for (int j = 0; j < n; j++)
		                a[i][j] = sc.nextInt();

		        System.out.println("Input matrix:");
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                System.out.print(a[i][j] + " ");
		            }
		            System.out.println();
		        }

		        int sum = 0;
		        for (int i = 0; i < n; i++)
		            for (int j =0 ; j <=i; j++)
		                sum += a[i][j];

		        System.out.println("Upper triangle sum = " + sum);
			}

		}

	
