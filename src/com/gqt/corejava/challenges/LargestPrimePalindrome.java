package com.gqt.corejava.challenges;

public class LargestPrimePalindrome {
	public static void main(String[] args) {
	int limit=1000;
	int largestPrimePalindrome = findLargestPrimePalindrome(limit);
	System.out.println("Largest prime palindrome less than" + limit + " is: "+ largestPrimePalindrome);
	}
	private static int findLargestPrimePalindrome(int limit) {
	for (int i=limit -1; i > 0; i--) {
	if (isPalindrome(i) && isPrime(i)) {
	return i;
	}
	}
	return -1;
	}
	private static boolean isPalindrome(int number) {
	String strNumber = String.valueOf(number);
	StringBuilder reversed= new StringBuilder(strNumber).reverse();
	return strNumber.equals(reversed.toString());
	}
	private static boolean isPrime(int number) {
	if (number< 2) {
	return false;
	}
	for (int i=2; i<= Math.sqrt(number); i++) {
	if (number%i==0) {
	return false;
	}
	}
	return true;
	}
}
