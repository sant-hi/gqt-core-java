package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class AreaCircle {
	    static double area(int r) {
	        return Math.PI * r * r;
	    }
	    static double area(double r) {
	        return Math.PI * r * r;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();
	        System.out.println("Area = " + area(r));
	    }
	}


