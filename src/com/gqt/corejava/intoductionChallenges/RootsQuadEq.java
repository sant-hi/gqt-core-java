package com.gqt.corejava.intoductionChallenges;

public class RootsQuadEq {
	    public static double squareRoot(double n) {
	        double x = n;
	        double y = 1;
	        double e = 0.000001; 
	        while (x - y > e) {
	            x = (x + y) / 2;
	            y = n / x;
	        }
	        return x;
	    }
	    public static void main(String[] args) {
	        double a = 1, b = -3, c = 2; 
	        double d = b * b - 4 * a * c;

	        if (d > 0) {
	            System.out.println("Roots are real and different: " +
	                ((-b + squareRoot(d)) / (2 * a)) + ", " +
	                ((-b - squareRoot(d)) / (2 * a)));
	        } 
	        else if (d == 0) {
	            System.out.println("Roots are real and same: " + (-b / (2 * a)));
	        } 
	        else {
	            System.out.println("Roots are complex: " +
	                (-b / (2 * a)) + " + " + (squareRoot(-d) / (2 * a)) + "i, " +
	                (-b / (2 * a)) + " - " + (squareRoot(-d) / (2 * a)) + "i");
	        }
	    }
	}

