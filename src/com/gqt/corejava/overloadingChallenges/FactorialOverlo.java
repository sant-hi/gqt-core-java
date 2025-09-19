package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class FactorialOverlo {
	    static int fact(int n) {
	        int res = 1;
	        for (int i = 1; i <= n; i++) res *= i;
	        return res;
	    }
	    static long fact(long n) { 
	        long res = 1;
	        for (long i = 1; i <= n; i++) res *= i;
	        return res;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        System.out.println("Factorial = " + fact(n));
	    }
	}


