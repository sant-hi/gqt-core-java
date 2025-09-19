package com.gqt.corejava.challenges;
import java.util.Scanner;
public class ShortestPalind {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String input = scanner.nextLine();
	int length = findShortestPalindromeLength(input);
	System.out.println("The length of the shortest palindrome that can be created is: " + length);
	}
	private static int findShortestPalindromeLength(String str) {
	int[] charCount = new int[256];
	for (char c: str.toCharArray()) {
	charCount[c]++;
	}
	int oddCount = 0;
	for (int count: charCount) {
	if (count%2!=0) {
	oddCount++;
	}
	}
	// A palindrome can have at most one character with an odd count
	return (oddCount <= 1)? str.length(): str.length() - (oddCount - 1);
}
	}
