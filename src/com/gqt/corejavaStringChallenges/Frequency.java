package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] freq = new int[256];

        for (char ch : input.toCharArray())
            freq[ch]++;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                System.out.println((char) i + ": " + freq[i]);
        }
	}

}
