package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        StringBuilder result = new StringBuilder();
	        boolean[] seen = new boolean[256];

	        for (char ch : input.toCharArray()) {
	            if (seen[ch]==false) {
	                seen[ch] = true;
	                result.append(ch);
	            }
	        }
	        System.out.println("String after removing duplicates: " + result);
	}

}
