package com.gqt.corejava.challenges;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

			String stringWithSpaces = " Hello World";

			String stringWithoutSpaces=stringWithSpaces.replaceAll("\\s", "");

			System.out.println("Original string:" + stringWithSpaces);

			System.out.println("String without spaces: " + stringWithoutSpaces);
	}

}
