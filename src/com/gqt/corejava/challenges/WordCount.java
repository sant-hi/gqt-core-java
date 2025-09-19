package com.gqt.corejava.challenges;
import java.util.Scanner;
public class WordCount {
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String sentence = scanner.nextLine();
	System.out.println("Enter the word to count: ");
	String wordToCount = scanner.next();
	int count =countOccurrences(sentence, wordToCount);
	System.out.println("The word \"" + wordToCount + "\" appears " + count+" times in the sentence.");
	}
	private static int countOccurrences(String sentence, String wordToCount) {
	String[] words =sentence.split("\\s+");
	int count = 0;
	for (String word: words) {
	if (word.equalsIgnoreCase(wordToCount)) {
	count++;
	}
	}
	return count;
}
}
