/**
 *
-  -  -  -  -  $  
-  -  -  -  $  $  $  
-  -  -  $  $  $  $  $  
-  -  $  $  $  $  $  $  $  
-  $  $  $  $  $  $  $  $  $  
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/**
 * @author USER
 * @category pattern
 * @description This is an example for conditional pattern
 */
public class Patterns42 {

	/**
	 * @param args
	 * @description This contains source code for pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the size");
	        int n = sc.nextInt(); 

	        for (int i = 1; i <= n; i++) {
	         
	            for (int j = n; j >=i; j--) {
	                System.out.print("-  ");
	            }

	       
	            for (int j = 1; j <= 2 * i - 1; j++) {
	            	System.out.print("$  ");
	            }

	            System.out.println();
	        }

	        sc.close();
	        
	}

}
