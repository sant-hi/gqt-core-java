package com.gqt.corejava.challenges;

public class ContainsOnlyDigits {

		public static void main(String[] args) {

		String str = "12345";

		if (str.matches("\\d+")) {

		System.out.println(str + " contains only digits.");

		} else {

		System.out.println(str + " does not contain only digits.");

		}
}
}
