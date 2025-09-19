package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class SimpleInterest {
	    static double calculate(double p, double r, double t) {
	        return (p * r * t) / 100;
	    }
	    static double calculate(int p, int r, int t) { 
	        return (p * r * t) / 100.0;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter principal, rate, time: ");
	        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
	        System.out.println("Simple Interest = " + calculate(p, r, t));
	    }
	}

