package com.gqt.corejava.challenges;

public class StrongNumberCheck {
		public static void main(String[] args) {
		int number = 145;
		boolean isStrong = checkStrongNumber(number);
		if (isStrong) {
		System.out.println(number + " is a strong number.");
		} else {
		System.out.println(number + " is not a strong number.");
		}
		}
		private static boolean checkStrongNumber(int number) {
		int originalNumber = number;
		int sum = 0;
		while (number > 0) {
		int digit = number % 10;
		sum += calculateFactorial(digit);
		number /= 10;
		}
		return sum == originalNumber;
		}
		private static int calculateFactorial(int n) {
		if (n== 0 || n == 1) { 
			return 1;
		} else {
		return n * calculateFactorial(n - 1);
		}
		}
		}

