package com.gqt.corejava.challengesArrays;
import java.util.Scanner;
public class Saddlepoint {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Rows: ");
		        int m = sc.nextInt();
		        System.out.print("Cols: ");
		        int n = sc.nextInt();
		        int[][] a = new int[m][n];
		        System.out.println("Enter matrix:");
		        for(int i=0;i<m;i++)
		            for(int j=0;j<n;j++)
		                a[i][j] = sc.nextInt();

		        boolean found = false;
		        for(int i=0;i<m;i++) {
		          
		            int minVal = a[i][0];
		            int colIndex = 0;
		            for(int j=1;j<n;j++) {
		                if(a[i][j] < minVal) {
		                    minVal = a[i][j];
		                    colIndex = j;
		                }
		            }
		        
		            boolean isSaddle = true;
		            for(int k=0;k<m;k++) {
		                if(a[k][colIndex] > minVal) {
		                    isSaddle = false;
		                    break;
		                }
		            }
		            if(isSaddle) {
		                System.out.println("Saddle point = " + minVal + " at (" + i + "," + colIndex + ")");
		                found = true;
		                break;
		            }
		        }
		        if(!found) System.out.println("No saddle point found");
		    }
		}
