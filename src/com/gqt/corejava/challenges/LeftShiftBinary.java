package com.gqt.corejava.challenges;
public class LeftShiftBinary {
		public static void main(String[] args) {
		int binaryNumber = 0b10101;
		int shiftCount = 2;
		int result = binaryNumber << shiftCount;
		System.out.println("Original binary number: " + Integer.toBinaryString(binaryNumber));
		System.out.println("Binary number after left shift by " + shiftCount + " positions: " + Integer.toBinaryString(result));
		}
		}

