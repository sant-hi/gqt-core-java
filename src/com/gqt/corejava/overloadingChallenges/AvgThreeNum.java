package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class AvgThreeNum {
	    static double average(int a, int b, int c) {
	        return (a + b + c) / 3.0;
	    }
	    static double average(double a, double b, double c) { 
	        return (a + b + c) / 3.0;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        double x = sc.nextDouble(), y = sc.nextDouble(), z = sc.nextDouble();
	        System.out.println("Average = " + average(x, y, z));
	    }
	}

