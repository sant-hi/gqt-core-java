package com.gqt.corejava.challenges;
import java.util.HashMap;
import java.util.Map;
public class SecondMostFrq {
	public static void main(String[] args) {
		String str = "programming";
		char secondMostFrequentChar = findSecondMostFrequentCharacter(str);
		System.out.println("Second most frequent character in the string: " + secondMostFrequentChar);
		}
		private static char findSecondMostFrequentCharacter(String str) {
		Map<Character, Integer> charFrequencyMap = new HashMap();
		for (char ch : str.toCharArray()) {
		charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
		}
		char mostFrequentChar = ' ';
		char secondMostFrequentChar = ' ';
		int maxFrequency = 0;
		for (Map.Entry<Character, Integer> entry :charFrequencyMap.entrySet())
		{
		if (entry.getValue() > maxFrequency) {
		secondMostFrequentChar = mostFrequentChar;
		mostFrequentChar = entry.getKey();
		maxFrequency=entry.getValue();
		} else if (entry.getValue() >
		charFrequencyMap.getOrDefault(secondMostFrequentChar, 0)) {
		secondMostFrequentChar = entry.getKey();
		}
		}
		return secondMostFrequentChar;

		}

		}
	
