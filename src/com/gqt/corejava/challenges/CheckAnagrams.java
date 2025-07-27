package com.gqt.corejava.challenges;
import java.util.Arrays;

public class CheckAnagrams {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		boolean areAnagrams = Arrays.equals(charArray1, charArray2);
		if (areAnagrams) {
		System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
		System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
		}
}
