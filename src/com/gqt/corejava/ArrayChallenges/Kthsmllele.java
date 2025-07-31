package com.gqt.corejava.ArrayChallenges;
import java.util.*;
public class Kthsmllele {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Size: ");
		        int n = sc.nextInt();
		        if(n == 0) {
		            System.out.println("Empty array.");
		            return;
		        }
		        int[] arr = new int[n];
		        System.out.print("Elements: ");
		        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		        System.out.print("Enter k: ");
		        int k = sc.nextInt();
		        if(k < 1 || k > n) {
		            System.out.println("Invalid k.");
		            return;
		        }
		        int[] sorted = Arrays.copyOf(arr, n);
		        Arrays.sort(sorted);
		        int kthSmallest = sorted[k-1];
		        int kthLargest = sorted[n-k];
		        System.out.println(k + "th smallest = " + kthSmallest + ", " + k + "th largest = " + kthLargest);
		    }
}
