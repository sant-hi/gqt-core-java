/**
 * 
 */
package com.gqt.corejava.arrayprograms;
import java.util.Scanner;
/**
 * 
 */
class ArrayOperations{
	int arr[];
	Scanner sc=new Scanner(System.in);
	void createArray() {
		System.out.println("Enter the student count:");
		int n=sc.nextInt();
		
		arr=new int[n];
		System.out.println("Array created");
		System.out.println("-------------------------------------");
	}
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks:"+(i+1));
			arr[i]=sc.nextInt();
			System.out.println("data stored into the array");
			
		}}
		void displayData() {
			for(int i=0;i<arr.length;i++) {
				System.out.println("the marks of sudents :"+(i+1)+" is ="+arr[i]);
			
		}
	}
}
public class Arraycode2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayOperations ao=new ArrayOperations();
ao.createArray();
ao.collectData();
ao.displayData();
	}

}
