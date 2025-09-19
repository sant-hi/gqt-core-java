package com.gqt.corejava.challenges;

public class CommonChar {
		public static void main(String[] args) {
		String str1= "hello";
		String str2 ="world";
		String commonChars=findCommonCharacters(str1, str2);
		System.out.println("Common characters between " + str1 +" and " + str2 +":"+ commonChars);
		}
		private static String findCommonCharacters(String str1, String str2) {
		StringBuilder commonChars = new StringBuilder();
		for (char ch: str1.toCharArray()) {
		if (str2.indexOf(ch) != -1 && commonChars.indexOf(String.valueOf(ch))== -1) {
		commonChars.append(ch);
		}
		}
		return commonChars.toString();
		}
		}

