package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class CelToFar {
	    static double convert(double celsius) {
	        return (celsius * 9/5) + 32;
	    }
	    static double convert(int celsius) { 
	        return (celsius * 9/5.0) + 32;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter temperature in Celsius: ");
	        double c = sc.nextDouble();
	        System.out.println("Fahrenheit = " + convert(c));
	    }
	}


