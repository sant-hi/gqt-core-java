package com.gqt.corejava.challenges;

public class PrimeNumCheck {
	public static void main(String[] args) {
	int number = 17;
	boolean isPrime = isPrimeNumber(number);
	if (isPrime) {
	System.out.println(number + " is a prime number.");
	} else {
		System.out.println(number + " is not a prime number.");
	}
	}
	private static boolean isPrimeNumber(int num) {
	if (num <= 1) {
	return false;
	}
	for (int i = 2; i <= Math.sqrt(num); i++) { if (num%i== 0) {
	return false;
	}
	}
	return true;
}
}
