package com.gqt.corejava.ArrayChallenges;
import java.util.*;
public class SpiralOrder {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Rows: ");
		        int m = sc.nextInt();
		        System.out.print("Cols: ");
		        int n = sc.nextInt();
		        int[][] a = new int[m][n];
		        System.out.println("Enter matrix:");
		        for (int i = 0; i < m; i++)
		            for (int j = 0; j < n; j++)
		                a[i][j] = sc.nextInt();
		        System.out.println("Input matrix:");
		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j < n; j++) {
		                System.out.print(a[i][j] + " ");
		            }
		            System.out.println();
		        }
		        int top = 0, bottom = m - 1, left = 0, right = n - 1;
		        List<Integer> spiral = new ArrayList<>();
		        while (top <= bottom && left <= right) {
		            for (int j = left; j <= right; j++) spiral.add(a[top][j]);
		            top++;
		            for (int i = top; i <= bottom; i++) spiral.add(a[i][right]);
		            right--;
		            if (top <= bottom) {
		                for (int j = right; j >= left; j--) spiral.add(a[bottom][j]);
		                bottom--;
		            }
		            if (left <= right) {
		                for (int i = bottom; i >= top; i--) spiral.add(a[i][left]);
		                left++;
		            }
		        }
		        System.out.print("Spiral order: ");
		        for (int v : spiral) {
		            System.out.print(v + " ");
		        }
		    }
		}
