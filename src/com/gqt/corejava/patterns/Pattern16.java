package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size:");
		        int rows = sc.nextInt();
		System.out.println("Enter the column size:");
		        int cols = sc.nextInt();

		        for (int i = 0; i < rows; i++) {  
		            for (int j = 0; j < cols; j++) {  
		               
		                if ((i + j) % 2 == 0) {
		                    System.out.print("1 ");
		                } else {
		                    System.out.print("0 ");
		                }
		            }
		            System.out.println(); 
		        }
		    }
		
	}


