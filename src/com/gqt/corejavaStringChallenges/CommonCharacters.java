package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class CommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        boolean[] seen = new boolean[256];

        for (char ch : s1.toCharArray())
            seen[ch] = true;

        System.out.println("Common characters:");
        for (char ch : s2.toCharArray()) {
            if (seen[ch]) {
                System.out.print(ch + " ");
                seen[ch] = false;
            }
        }
	}

}
