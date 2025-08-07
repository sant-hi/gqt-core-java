package com.gqt.corejava.challenges;
import java.util.HashMap;

import java.util.Map;
public class MostFrequentCharacter {

	public static void main(String[] args) {

		String str = "programming";

		Map<Character, Integer> charFrequencyMap = new HashMap<>();

		for (char ch : str.toCharArray()) {

		charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);

		}

		char mostFrequentChar=' ';

		int maxFrequency = 0;

		for (Map.Entry<Character, Integer> entry: charFrequencyMap.entrySet())

		{

		if (entry.getValue() > maxFrequency) {

		mostFrequentChar = entry.getKey();

		maxFrequency = entry.getValue();

		}

		}
		System.out.println("Most frequent character in the string: mostFrequentChar); "+mostFrequentChar);

		}
}
