package com.gqt.corejava.challenges;
public class PowerOfTwoCheck {
		public static void main(String[] args) {
		int number = 16;
		boolean isPowerOfTwo = (number & (number - 1)) == 0;
		if (isPowerOfTwo) {
		System.out.println(number + " is a power of 2.");
		} else {
		System.out.println(number + " is not a power of 2.");
		}
		}
}
