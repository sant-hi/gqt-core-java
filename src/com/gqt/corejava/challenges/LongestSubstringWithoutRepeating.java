package com.gqt.corejava.challenges;
import java.util.HashSet;
import java.util.Set;
public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {

		String str = "abcabcbb";

		Set<Character> uniqueChars = new HashSet<>();

		int maxLength = 0;

		int i = 0;

		int j = 0;

		while (j < str.length()) {

		if (!uniqueChars.contains(str.charAt(j))) {

		uniqueChars.add(str.charAt(j));

		maxLength = Math.max(maxLength, j - i + 1);
		 j++;
		} 
		else { 

		uniqueChars.remove(str.charAt(i));
		 i++;
		}
	}
		System.out.println("Length of the longest substring without repeating characters: " + maxLength);
	}}

