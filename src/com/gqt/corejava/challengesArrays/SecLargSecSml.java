package com.gqt.corejava.challengesArrays;
		import java.util.Scanner;

		public class SecLargSecSml {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("enter the size:");
		        int n = sc.nextInt();
		        if (n < 2) { 
		            System.out.println("Need at least two distinct elements.");
		            return;
		        }

		        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		        System.out.println("enter the elements:");
		        for (int i = 0; i < n; i++) {
		            int v = sc.nextInt();

		            if (v > firstMax) {
		                secondMax = firstMax;
		                firstMax = v;
		            } else if (v > secondMax && v != firstMax) {
		                secondMax = v;
		            }

		            if (v < firstMin) {
		                secondMin = firstMin;
		                firstMin = v;
		            } else if (v < secondMin && v != firstMin) {
		                secondMin = v;
		            }
		        }

		        if (secondMax == Integer.MIN_VALUE)
		            System.out.println("No distinct second largest");
		        else
		            System.out.println("Second Largest = " + secondMax);

		        if (secondMin == Integer.MAX_VALUE)
		            System.out.println("No distinct second smallest");
		        else
		            System.out.println("Second Smallest = " + secondMin);
		    }
		}
