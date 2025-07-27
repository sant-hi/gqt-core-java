package com.gqt.corejava.challenges;

public class VowelConsonent {

	public static void main(String[] args) {
			String str = "Hello, World!";
			str = str.toLowerCase();

			int vowelCount = 0;

			int consonantCount = 0;

			for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

			if (ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u') {

			vowelCount++;

			} else {

			consonantCount++;

			}

			}

			}

			System.out.println("Vowel count: " + vowelCount); System.out.println("Consonant count: " + consonantCount);
	}

}
