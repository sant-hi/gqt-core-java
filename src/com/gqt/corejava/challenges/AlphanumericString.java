package com.gqt.corejava.challenges;
public class AlphanumericString {
	public static void main(String[] args) {
			String str ="Abc123";
			boolean isAlphanumeric = isAlphanumericString(str);
			if (isAlphanumeric) {
			System.out.println(str+" is an alphanumeric string");
			} else {
			System.out.println(str + " is not an alphanumeric string.");
			}
	}
			private static boolean isAlphanumericString(String str) {
			return str.matches("[a-zA-Z0-9]+");
	}

}
