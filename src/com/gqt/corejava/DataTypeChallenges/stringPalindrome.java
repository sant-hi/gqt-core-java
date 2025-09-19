package com.gqt.corejava.DataTypeChallenges;
public class stringPalindrome {
	public static void main(String[] args) {
		 String str = "madam";
	        String rev = new StringBuilder(str).reverse().toString();
	        if (str.equals(rev))
	            System.out.println(str + " is Palindrome");
	        else
	            System.out.println(str + " is Not Palindrome");
	}
}
