package com.gqt.corejava.challengesArrays;
import java.util.*;
public class ArraysEqlornot {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Size of array 1: ");
		        int n1 = sc.nextInt();
		        int[] a = new int[n1];
		        System.out.print("Elements of array 1: ");
		        for(int i=0;i<n1;i++) a[i]=sc.nextInt();

		        System.out.print("Size of array 2: ");
		        int n2 = sc.nextInt();
		        int[] b = new int[n2];
		        System.out.print("Elements of array 2: ");
		        for(int i=0;i<n2;i++) b[i]=sc.nextInt();

		        boolean equal = false;
		        if(n1 == n2) {
		            equal = true;
		            for(int i=0;i<n1;i++) {
		                if(a[i] != b[i]) {
		                    equal = false;
		                    break;
		                }
		            }
		        }
		        System.out.println(equal ? "Arrays are equal" : "Arrays are not equal");
		    }
}
