package com.gqt.corejava.challengesArrays;
import java.util.Scanner;
import java.util.Arrays;
public class MergeSortedArray {

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

		        int[] merged = new int[n1+n2];
		        System.arraycopy(a, 0, merged, 0, n1);
		        System.arraycopy(b, 0, merged, n1, n2);
		        Arrays.sort(merged);

		        System.out.println("Merged sorted array: " + Arrays.toString(merged));
		    }
		}

	
