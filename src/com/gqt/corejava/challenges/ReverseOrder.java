package com.gqt.corejava.challenges;
public class ReverseOrder {
	public static void main(String[] args) {
	String sentence ="This is a sample sentence.";
	String reversed = reverseOrderOfWordsAndCharacters(sentence);
	System.out.println("Original sentence: " + sentence);
	System.out.println("Reversed sentence: " + reversed);
	}
	private static String reverseOrderOfWordsAndCharacters(String sentence) {
	String[] words = sentence.split("\\s");
	StringBuilder reversed = new StringBuilder();
	for (int i = words.length - 1; i >= 0; i--) {
	String reversedWord = new StringBuilder(words[i]).reverse().toString();
	reversed.append(reversedWord).append(" ");
	}
	return reversed.toString().trim();
	}
}
