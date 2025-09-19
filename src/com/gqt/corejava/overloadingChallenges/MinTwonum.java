package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class MinTwonum {
	    static int min(int a, int b) {
	        return (a < b) ? a : b;
	    }
	    static double min(double a, double b) { // overloaded
	        return (a < b) ? a : b;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        double x = sc.nextDouble(), y = sc.nextDouble();
	        System.out.println("Minimum = " + min(x, y));
	    }
	}


