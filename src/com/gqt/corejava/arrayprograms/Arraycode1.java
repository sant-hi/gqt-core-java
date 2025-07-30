/**
 * 
 */
package com.gqt.corejava.arrayprograms;
import java.util.Scanner;

/**
 * 
 */
public class Arraycode1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student count:");
		int n=sc.nextInt();
		
		int arra[]=new int[n];
		for(int i=0;i<arra.length;i++) {
			System.out.println("Enter the marks:"+(i+1));
			arra[i]=sc.nextInt();
		}
		System.out.println("-------------------------------------");
		for(int i=0;i<arra.length;i++) {
			System.out.println("the marks of sudents :"+(i+1)+"cis ="+arra[i]);
		}
	}

}
