package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class AreaTrigl {
	    static double area(double b, double h) {
	        return 0.5 * b * h;
	    }
	    static double area(double a, double b, double c) { // Heron's formula (overloaded)
	        double s = (a + b + c) / 2;
	        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter base and height: ");
	        double b = sc.nextDouble(), h = sc.nextDouble();
	        System.out.println("Area  = " + area(b, h));
	    }
	}


