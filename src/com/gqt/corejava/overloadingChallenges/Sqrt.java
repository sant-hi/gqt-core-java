package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class Sqrt {
	    static double sqrt(int n) {
	        return Math.sqrt(n);
	    }
	    static double sqrt(double n) {
	        return Math.sqrt(n);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        double num = sc.nextDouble();
	        System.out.println("Square root = " + sqrt(num));
	    }
	}

