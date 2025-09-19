package com.gqt.corejava.challenges;
public class HappyNumberCheck {
		public static void main(String[] args) {
		int number = 19;
		boolean isHappy = checkHappyNumber(number);
		if (isHappy) {
		System.out.println(number + " is a happy number.");
		} else {
		System.out.println(number + " is not a happy number."); 
		}
}
		private static boolean checkHappyNumber(int number) {
		int slow = number;
		int fast = number;
		do {
		slow = calculateSquareSum(slow); 
		fast = calculateSquareSum(calculateSquareSum(fast));
		} while (slow != fast);
		return slow == 1;
		}
		private static int calculateSquareSum(int num) {
		int sum = 0;
		while (num > 0) {
		int digit = num % 10;
		sum += digit * digit;
		num /= 10;
		}
		return sum;
		}
}
