package com.gqt.corejava.challengesArrays;
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.print("Elements: ");
	        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
	        System.out.print("Element to find: ");
	        int key = sc.nextInt();
	        int idx = -1;
	        for(int i=0;i<n;i++) {
	            if(arr[i] == key) {
	                idx = i;
	                break;
	            }
	        }
	        if(idx == -1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Index of element = " + idx);
	    }

}
