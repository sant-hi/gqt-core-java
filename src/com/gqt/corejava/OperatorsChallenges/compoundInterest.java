package com.gqt.corejava.OperatorsChallenges;
import java.util.Scanner;
public class compoundInterest {
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter principal, rate, and time: ");
	        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
	        double amount = p * Math.pow((1 + r / 100), t);
	        double ci = amount - p;
	        System.out.println("Compound Interest = " + ci);
	}
}
