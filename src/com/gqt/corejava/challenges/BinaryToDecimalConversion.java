package com.gqt.corejava.challenges;

public class BinaryToDecimalConversion {
		public static void main(String[] args) {
		String binaryNumber = "101010";
		int decimalNumber = convertBinaryToDecimal(binaryNumber);
		System.out.println("Decimal equivalent of binary number " + binaryNumber + " is: " + decimalNumber);
		}
		private static int convertBinaryToDecimal(String binaryNumber) {
		int decimalNumber = 0;
		int length = binaryNumber.length();
		for (int i = 0; i < length; i++) {
		int digit = Character.getNumericValue(binaryNumber.charAt(i)); decimalNumber += digit*Math.pow(2, length - 1 - i);
		}
		return decimalNumber;
		}
}
