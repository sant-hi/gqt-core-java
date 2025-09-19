package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class CompIntrest {
	    static double calculate(double p, double r, int t) {
	        return p * Math.pow((1 + r/100), t) - p;
	    }
	    static double calculate(double p, double r, int t, int n) { 
	        return p * Math.pow((1 + r/(100*n)), n*t) - p;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter principal, rate, time: ");
	        double p = sc.nextDouble(), r = sc.nextDouble();
	        int t = sc.nextInt();
	        System.out.println("Compound Interest = " + calculate(p, r, t));
	    }
	}


