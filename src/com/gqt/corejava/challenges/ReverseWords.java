package com.gqt.corejava.challenges;
public class ReverseWords {
		public static void main(String[] args) {
		String sentence = "This is a sample sentence.";
		String reversedSentence = reverseWordsInSentence(sentence);
		System.out.println("Original sentence: " + sentence); System.out.println("Reversed sentence: " + reversedSentence);
		}
		private static String reverseWordsInSentence(String sentence) {
		String[] words = sentence.split("\\s");
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
		reversed.append(words[i]).append(" ");
		}
		return reversed.toString().trim();
		}
		}

