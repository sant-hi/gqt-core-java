package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class DiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter matrix size: ");
	        int n = sc.nextInt();
	        int mat[][] = new int[n][n];
	        System.out.println("Enter elements:");
	        for(int i=0;i<n;i++)
	            for(int j=0;j<n;j++)
	                mat[i][j] = sc.nextInt();
	        int sum = 0;
	        for(int i=0;i<n;i++)
	            sum += mat[i][i] + mat[i][n-i-1];
	        if(n % 2 != 0) sum -= mat[n/2][n/2];
	        System.out.println("Sum of diagonals: " + sum);
	}

}
