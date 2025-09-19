package com.gqt.corejava.challenges;

public class ArrayGD {
		public static void main(String[] args) {
			int[] numbers = {24, 36, 48, 60};
		int gcd = calculateArrayGCD(numbers);
		System.out.println("GCD of the array is: " + gcd);
		}
		private static int calculateArrayGCD(int[] numbers) {
		int result = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			result = calculateGCD(result, numbers[i]);
			}
		return result;
		}
		private static int calculateGCD(int a, int b) {
		while (b != 0) {
		int temp = b;
		b=a% b;
		a = temp;
		}
		return a;
		}
}
