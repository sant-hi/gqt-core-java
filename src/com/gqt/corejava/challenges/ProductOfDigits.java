package com.gqt.corejava.challenges;
public class ProductOfDigits {
		public static void main(String[] args) {
		int number = 12345;
		int product = calculateProductOfDigits(number);
		System.out.println("Product of digits in " + number + " is: " + product);
		}
		private static int calculateProductOfDigits(int number) {
		int product = 1;
		while (number > 0) {
		int digit = number % 10;
		product *= digit;
		number /= 10;
		}
		return product;
		}
}
