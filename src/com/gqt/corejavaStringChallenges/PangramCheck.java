package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class PangramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check pangram: ");
        String input = sc.nextLine().toLowerCase();
        boolean[] alphabet = new boolean[26];

        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                alphabet[ch - 'a'] = true;
        }

        for (boolean b : alphabet) {
            if (!b) {
                System.out.println("Not a pangram.");
                return;
            }
        }
        System.out.println("It is a pangram.");
	}

}
