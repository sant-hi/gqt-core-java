package com.gqt.corejava.challenges;

public class ArmstrongNumberCheck {
	public static void main(String[] args) {
	int number =153;
	boolean isArmstrong=checkArmstrongNumber(number);
	if (isArmstrong) {
	System.out.println(number+" is an Armstrong number.");
	} else {
	System.out.println(number+" is not an Armstrong number.");
	}
	}
	private static boolean checkArmstrongNumber(int number) {
	int originalNumber = number;
	int numberOfDigits =(int) Math.log10(number) + 1;
	int sum = 0;
	while (number > 0) {
	int digit =number % 10;
	sum += Math.pow(digit, numberOfDigits);
	number/= 10;
	}
	return sum ==originalNumber;
	}
}
