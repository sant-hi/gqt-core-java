package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class SumoftwoInnt {
	    static int sum(int a, int b) {
	        return a + b;
	    }
	    static int sum(int a, int b, int c) { 
	        return a + b + c;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter two integers: ");
	        int x = sc.nextInt(), y = sc.nextInt();
	        System.out.println("Sum = " + sum(x, y));
	    }
	}



