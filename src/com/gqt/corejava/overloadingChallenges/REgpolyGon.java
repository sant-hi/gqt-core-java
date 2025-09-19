package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class REgpolyGon {
	    static double area(int n, double s) {
	        return (n * s * s) / (4 * Math.tan(Math.PI / n));
	    }
	    static double area(int n, int s) { 
	        return (n * s * s) / (4.0 * Math.tan(Math.PI / n));
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of sides and side length: ");
	        int n = sc.nextInt();
	        double s = sc.nextDouble();
	        System.out.println("Area = " + area(n, s));
	    }
	}


