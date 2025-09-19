package com.gqt.corejava.challenges;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemovDupli {
	public static void main(String[] args) {
		String str ="programming";
	String withoutDuplicates= removeDuplicateCharacters(str);
	System.out.println("Original string: " + str);
	System.out.println("String without duplicates:"+ withoutDuplicates);
	}
	private static String removeDuplicateCharacters(String str) {
		Set <Character> uniqueChars =new LinkedHashSet();
	for (char ch :str.toCharArray()) { 
		uniqueChars.add(ch);
	}
	StringBuilder result = new StringBuilder();
	for (char ch: uniqueChars) {
	result.append(ch);
	}
	return result.toString();
	}
}
