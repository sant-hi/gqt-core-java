package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class TrapArea {
	    static double area(double a, double b, double h) {
	        return ((a + b) / 2) * h;
	    }
	    static double area(int a, int b, int h) { 
	        return ((a + b) / 2.0) * h;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter base1, base2, height: ");
	        double a = sc.nextDouble(), b = sc.nextDouble(), h = sc.nextDouble();
	        System.out.println("Area = " + area(a, b, h));
	    }
	}


