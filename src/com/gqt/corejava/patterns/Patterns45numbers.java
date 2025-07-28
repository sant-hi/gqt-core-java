/**
 * 
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author USER
 * @category pattern
 * @description This is an example for conditional pattern
 */
public class Patterns45numbers {

	/**
	 * @param args
	 * @description This contains source code for pattern
	 */
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size : ");
			int n = sc.nextInt();
	  //0 
			for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0|| i==(n-1) || j==0 ||j==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}		
			 System.out.print("		");
			
				for(int j=0;j<n;j++) {	
		//1
					if(i+j==n/2||j==(n/2)||i==(n-1)) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
		//2
				System.out.print("		");
				for(int j=0;j<n;j++) {
					if(i==0||j==(n-1)&&i<=n/2||i==n/2||j==0&&i>=n/2||i==(n-1)) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
		//3
				System.out.print("		");
				for(int j=0;j<n;j++) {
					if(i==0||j==(n-1)||i==n/2||i==(n-1)) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
		//4
				System.out.print("		");
				for(int j=0;j<n;j++) {
					if(i+j==n/2||j==(n/2)||i==n/2)  
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
		//5
				System.out.print("		");
				for(int j=0;j<n;j++) {
					if(i==0||i==n/2||j==0&&i<=n/2||i==(n-1)||j==n-1&&i>=n/2) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
		//6
				System.out.print("		");
				for(int j=0;j<n;j++) {
					if(i==0||i==n/2||j==0||i==(n-1)||j==n-1&&i>=n/2) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}	
		//7
				System.out.print("		");
				for(int j=0;j<n;j++) {
					if(i==0||i+j==n-1) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
		//8

				System.out.print("		");
				for(int j=0;j<n;j++) {
					if(i==0|| i==(n-1) || j==0 || j==(n-1) ||
					   i==(n/2) ) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
		//9

				System.out.print("		");
				for(int j=0;j<n;j++) {
					if(i==0|| j==0&&i<=n/2 || j==(n-1) ||
					   i==(n/2) ) 
					{
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				
		System.out.println();	
	}
	}
}