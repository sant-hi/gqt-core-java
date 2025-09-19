package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class SumFloats {
	    static float sum(float a, float b) {
	        return a + b;
	    }
	    static double sum(double a, double b, double c) { 
	        return a + b + c;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two floats: ");
	        float x = sc.nextFloat(), y = sc.nextFloat();
	        System.out.println("Sum = " + sum(x, y));
	    }
	}


