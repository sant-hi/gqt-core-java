package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class Rhombus {
	    static double area(double d1, double d2) {
	        return (d1 * d2) / 2;
	    }
	    static int area(int d1, int d2) { 
	        return (d1 * d2) / 2;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter diagonals d1 and d2: ");
	        double d1 = sc.nextDouble(), d2 = sc.nextDouble();
	        System.out.println("Area = " + area(d1, d2));
	    }
	}


