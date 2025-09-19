package com.gqt.corejava.challenges;
public class PalindCheck {
		public static void main(String[] args) {
		int number = 1221;
		int originalNumber = number;
		int reversedNumber = 0;
		while (number > 0) {
		int digit = number % 10;
		reversedNumber = reversedNumber * 10 + digit;
		number /= 10;
		}
		boolean isPalindrome = originalNumber == reversedNumber;
		if (isPalindrome) {
		System.out.println(originalNumber + " is a palindrome.");
		} else {
		System.out.println(originalNumber + " is not a palindrome.");
		}
		}
		}

