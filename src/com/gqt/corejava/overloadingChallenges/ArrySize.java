package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class ArrySize {
	    static double average(int[] arr) {
	        int sum = 0;
	        for (int n : arr) sum += n;
	        return (double) sum / arr.length;
	    }
	    static double average(double[] arr) { 
	        double sum = 0;
	        for (double n : arr) sum += n;
	        return sum / arr.length;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
	        System.out.println("Average = " + average(arr));
	    }
	}


