package com.gqt.corejava.challenges;
import java .util.Scanner;
public class WordCounter {
		public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence= scanner.nextLine();
		int wordCount = countWords(sentence);
		System.out.println("The number of words in the sentence is: " +wordCount);
		}
		private static int countWords(String sentence) {
			if (sentence == null || sentence.isEmpty()) {
		return 0;
			}
		// Split the sentence using space as the delimiter String[] words = sentence.split("\\s+");
			String[] words=sentence.split("\\s+");
		return words.length;
		}
}
