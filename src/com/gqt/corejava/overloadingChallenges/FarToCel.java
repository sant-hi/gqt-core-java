package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class FarToCel {
	    static double convert(double f) {
	        return (f - 32) * 5/9;
	    }
	    static double convert(int f) { 
	        return (f - 32) * 5/9.0;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature in Fahrenheit: ");
	        double f = sc.nextDouble();
	        System.out.println("Celsius = " + convert(f));
	    }
	}


