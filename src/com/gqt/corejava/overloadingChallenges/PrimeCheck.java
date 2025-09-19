package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class PrimeCheck {
	    static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	    static boolean isPrime(long n) { 
	        if (n <= 1) return false;
	        for (long i = 2; i <= n / 2; i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        System.out.println(n + (isPrime(n) ? " is Prime" : " is Not Prime"));
	    }
}
