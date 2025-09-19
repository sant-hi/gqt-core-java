package com.gqt.corejava.challenges;

public class FactorialUsingRecursion {
		public static void main(String[] args) {
		int number = 5;
		long factorial = calculateFactorial(number);
		System.out.println("Factorial of " + number + " is: " + factorial);
		}
		private static long calculateFactorial(int n) {
		if (n == 0 || n == 1) {
		return 1;
		} else {
		return n * calculateFactorial(n - 1);
		}
		}
		}

