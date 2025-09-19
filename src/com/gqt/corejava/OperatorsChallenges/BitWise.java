package com.gqt.corejava.OperatorsChallenges;
import java.util.Scanner;
public class BitWise {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two integers: ");
	        int a = sc.nextInt(), b = sc.nextInt();
	        System.out.println("AND = " + (a & b));
	        System.out.println("OR = " + (a | b));
	        System.out.println("XOR = " + (a ^ b));
	}
}
