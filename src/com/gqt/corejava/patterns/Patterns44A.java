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
public class Patterns44A {

	/**
	 * @param args
	 * @description This contains source code for pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
	//A
				if(i==0 ||j==0 || j==(n-1) ||
				   i==(n/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//B
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
			
	//C
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0|| i==(n-1) || j==0) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//D
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0|| i==(n-1) || j==0 ||j==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//E
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0|| i==(n-1) || j==0 || i==(n/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
	//F	
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0 ||j==0 || i==(n/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//G		
			System.out.print("		");
			for(int j=0;j<n;j++) {
				 if (i==0||j==0||i==(n-1) &&j<=n/2||j==(n/2)&&i>=n/2||i==(n/2)&&j>=n/2||j==(n-1)&&i>=n/2
		                ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//H	
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(j==0 || j==(n-1) || i==(n/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
	//I	
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==(n/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
			
	//J	
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0 || j==(n/2) || i-j==(n/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
			
	//K	
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(j==0 || i-j==(n/2) || i+j==(n/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
			
	//L  
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(j==0 || (i==n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
			
	//M	
			System.out.print("		");
			for(int j=0;j<n;j++) {
				 if (j == 0 || j == n - 1 || i == j && i <= n / 2 || i + j == n - 1 && i <= n / 2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
			
	//N		
			System.out.print("		");
			for(int j=0;j<n;j++) {
				 if (j == 0 || j == n - 1 || i == j) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
	//O
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0|| i==(n-1) || j==0 ||j==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//P
			System.out.print("		");
			for(int j=0;j<n;j++) {
				 if (
		                    j == 0 ||                                      
		                    (i == 0 && j <= n / 2) ||                        
		                    (i == n / 2 && j <= n / 2) ||                    
		                    (j == n / 2 && i > 0 && i < n / 2)     
		                ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
	//Q
			System.out.print("		");
			for(int j=0;j<n;j++) {
				 if (
		                     j==0 && i<=n/2||                           
		                    i == 0 && j <= n / 2 ||                   
		                    i == n / 2 && j <= n / 2 ||                 
		                    j == n / 2 && i <= n / 2 ||
		                 i==j && j>=n/2
		                ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//R
			
			System.out.print("		");
			for(int j=0;j<n;j++) {
				 if (
		                    j == 0 ||                                      
		                    (i == 0 && j <= n / 2) ||                        
		                    (i == n / 2 && j <= n / 2) ||                    
		                    (j == n / 2 && i > 0 && i < n / 2) ||
		                  i-j==(n/2)
		                ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
	//S
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0|| i==(n-1) || j==0 && i<=n/2 ||i==n/2||j==(n-1)&&i>=n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
	//T 
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0 ||  j==(n/2)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
	//U
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==(n-1) || j==0 ||j==(n-1)) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//V		
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(j==0 && i<=n/2||i-j==(n/2) ||i+j==(n-1)+(n/2)||j==(n-1)&&i<=n/2 ) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
	//W
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if( j==0 ||j==(n-1)||i==j && j>=n/2||i+j==(n-1)&&j<=n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
	//X		
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i+j==(n-1)||i==j) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
	//Y		
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i+j==(n-1)&&i<=n/2||i==j&&i<=n/2||j==n/2 && i>=n/2) 
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
	//Z		
			System.out.print("		");
			for(int j=0;j<n;j++) {
				if(i==0||i+j==(n-1)||i==(n-1)) 
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


