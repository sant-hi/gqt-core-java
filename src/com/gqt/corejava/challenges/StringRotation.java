package com.gqt.corejava.challenges;

public class StringRotation {
		public static void main(String[] args) {
		String str1 = "waterbottle";
		String str2 = "erbottlewat";
		boolean isRotation = isStringRotation(str1, str2);
		if (isRotation) {
		System.out.println(str2 + " is a rotation of " + str1);
		} else {
		System.out.println(str2 + " is not a rotation of " + str1);
		}
		}
		private static boolean isStringRotation(String str1, String str2) {
		if (str1.length() != str2.length()) {
		return false;
		}
		String concatenated = str1 + str1;
		return concatenated.contains(str2);
		}
		}

