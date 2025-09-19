package com.gqt.corejava.challenges;

public class ConcateStrings {
	public static void main(String[] args) {
	String str1 = "Hello";
	String str2 ="World";

	char[] result = new char[ str1.length() + str2.length()];

	for (int i=0; i < str1.length(); i++) {

	result[i]=str1.charAt(i);
	}
	for (int i1=0; i1 < str2.length(); i1++) {
		result [str1.length()+i1] = str2.charAt(i1);
	}

	String concatenatedString = new String(result);

	System.out.println("Concatenated string:" + concatenatedString);
}
	}
