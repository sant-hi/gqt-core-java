package com.gqt.corejava.challenges;

public class CapitalizeWords {
			public static void main(String[] args) {

			String sentence = "this is a sample sentence";

			StringBuilder result = new StringBuilder();

			String[] words = sentence.split("\\s");

			for (String word: words) {

			result.append(Character.toUpperCase(word.charAt(0))).append(word.substring

			(1)).append(" ");
			}

			System.out.println("Original sentence: " + sentence);

			System.out.println("Modified sentence: " + result.toString().trim());


	}

}
