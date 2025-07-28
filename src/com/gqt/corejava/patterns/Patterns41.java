/**
 * #
 * # #
 * # - #
 * # - - #
 * # # # # #
 */

package com.gqt.corejava.patterns;
import java.util.Scanner;
/**
 * @author USER
 * @category pattern
 * @description This is an example for conditional pattern
 */
public class Patterns41 {

	/**
	 * @param args
	 * @description This contains source code for pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(i==0 || i==n-1 ||j==0 || j==i) {
					System.out.print("# ");
					
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
			
		}
		
	}

}
