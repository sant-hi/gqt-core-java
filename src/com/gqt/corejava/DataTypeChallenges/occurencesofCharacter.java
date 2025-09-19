package com.gqt.corejava.DataTypeChallenges;
public class occurencesofCharacter {

	public static void main(String[] args) {
		String str = "programming";
        char ch = 'm';
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }
        System.out.println("Occurrences of '" + ch + "': " + count);

	}

}
