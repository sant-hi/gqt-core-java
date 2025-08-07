package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (input.indexOf(ch) == input.lastIndexOf(ch)) {
                System.out.println("First non-repeated character: " + ch);
                return;
            }
        }
        System.out.println("No non-repeated character found.");
	}

}
