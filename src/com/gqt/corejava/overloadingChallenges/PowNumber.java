package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class PowNumber {
	    static double power(int base, int exp) {
	        return Math.pow(base, exp);
	    }
	    static double power(double base, double exp) { 
	        return Math.pow(base, exp);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter base and exponent: ");
	        double b = sc.nextDouble(), e = sc.nextDouble();
	        System.out.println("Result = " + power(b, e));
	    }
	}

