package com.gqt.corejava.challenges;
public class DecimalToBinaryConversion {
	public static void main(String[] args) {
	int decimalNumber = 25;
	String binaryString = convertToBinary(decimalNumber);
	System.out.println("Binary representation of " + decimalNumber +"is:" + binaryString); }
	private static String convertToBinary(int decimalNumber) {
	StringBuilder binary = new StringBuilder();
	while (decimalNumber > 0) {
	int remainder = decimalNumber % 2;
	binary.insert(0, remainder);
	decimalNumber /= 2;
	}
	return binary.toString();
	}
	}

