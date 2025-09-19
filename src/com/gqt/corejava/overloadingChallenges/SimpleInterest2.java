package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class SimpleInterest2 {
	    static int area(int side) {
	        return side * side;
	    }
	    static double area(double side) { 
	        return side * side;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter side length: ");
	        double s = sc.nextDouble();
	        System.out.println("Area = " + area(s));
	    }
	}

