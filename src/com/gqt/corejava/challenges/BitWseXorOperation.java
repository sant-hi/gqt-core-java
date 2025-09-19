package com.gqt.corejava.challenges;
public class BitWseXorOperation {
		public static void main(String[] args) {
		int binaryNumber1 = 0b1101;
		int binaryNumber2 = 0b1011;
		int result = binaryNumber1 ^ binaryNumber2;
		System.out.println("Binary XOR of " +
		Integer.toBinaryString(binaryNumber1) +
		" and " + Integer.toBinaryString(binaryNumber2) + " is: " +
		Integer.toBinaryString(result));
		}
		}

