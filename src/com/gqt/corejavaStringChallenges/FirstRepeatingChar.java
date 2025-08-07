package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class FirstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] freq = new int[256];

        for (char ch : input.toCharArray()) {
            if (freq[ch] == 1) {
                System.out.println("First repeating character: " + ch);
                return;
            }
            freq[ch]++;
        }
        System.out.println("No repeating characters found.");
	}

}
