package com.gqt.corejava.challenges;

public class CaptFirstLeter {
		public static void main(String[] args) {
		String sentence = "this is a sample sentence";
		String capitalizedSentence =capitalizeFirstLetterOfWords(sentence);
		System.out.println("Original sentence: " + sentence);
		System.out.println("Capitalized sentence: " + capitalizedSentence);
		}
		private static String capitalizeFirstLetterOfWords(String sentence) {
		String[] words = sentence.split("\\s"); StringBuilder result = new StringBuilder();
		for (String word: words) {
		result.append(Character.toUpperCase(word.charAt(0))).append(word.substring (1)).append(" ");
		}
		return result.toString().trim();

		}

		}

