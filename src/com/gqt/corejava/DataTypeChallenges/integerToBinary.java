package com.gqt.corejava.DataTypeChallenges;


public class integerToBinary {

	public static void main(String[] args) {
		 int num = 10;
	        String binary = Integer.toBinaryString(num);
	        System.out.println("Integer to Binary: " + binary);

	        int back = Integer.parseInt(binary, 2);
	        System.out.println("Binary to Integer: " + back);

	}

}
