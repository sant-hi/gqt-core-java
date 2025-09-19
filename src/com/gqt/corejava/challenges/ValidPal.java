package com.gqt.corejava.challenges;

public class ValidPal {
		public static void main(String[] args) {
		String str = "abca";
		boolean isValidPalindrome=isValidPalindromeAfterRemoval(str);
		if (isValidPalindrome) {
		System.out.println(str + " is a valid palindrome after removing a character.");
		} else {
		System.out.println(str + " is not a valid palindrome after removing a character.");
		}
		}
		private static boolean isValidPalindromeAfterRemoval(String str) { 
			for (int i=0,j=str.length()-1; i<j; i++,j--) {
		if (str.charAt(i) != str.charAt(j)) {
		return isPalindrome(str, i + 1, j) || isPalindrome(str, i, j - 1);
		}
		}
		return true;
		}
		private static boolean isPalindrome(String str, int start, int end) {
			while (start < end) {

		if (str.charAt(start) != str.charAt(end)) {
			return false;
		}
		start++;
		end--;
		}
		return true;
		}
		}

