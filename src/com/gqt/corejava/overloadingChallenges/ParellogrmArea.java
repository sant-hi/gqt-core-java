package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class ParellogrmArea {
	    static double area(double base, double height) {
	        return base * height;
	    }
	    static int area(int base, int height) { 
	        return base * height;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter base and height: ");
	        double b = sc.nextDouble(), h = sc.nextDouble();
	        System.out.println("Area = " + area(b, h));
	    }
	}

