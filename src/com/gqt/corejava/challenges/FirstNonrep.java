package com.gqt.corejava.challenges;
import java.util.HashMap; 
import java.util. Map;
public class FirstNonrep {
		public static void main(String[] args) {
		String str = "programming";
		char firstNonRepeatedChar = findFirstNonRepeatedCharacter(str);
		if (firstNonRepeatedChar != ' ') {
		System.out.println("First non-repeated character in the string: " +firstNonRepeatedChar);
		} else {
			System.out.println("All characters are repeated in the string.");
		}
		}
		private static char findFirstNonRepeatedCharacter(String str) {
		Map<Character, Integer> charFrequencyMap = new HashMap();
		for (char ch: str.toCharArray()) {
			charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
		}
		for (char ch: str.toCharArray()) {

		if (charFrequencyMap.get(ch) == 1) {

		return ch;

		}
}
		return ' ';
		}}
