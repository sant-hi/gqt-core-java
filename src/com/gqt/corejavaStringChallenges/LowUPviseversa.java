package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class LowUPviseversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        StringBuilder result = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (Character.isLowerCase(ch))
	                result.append(Character.toUpperCase(ch));
	            else if (Character.isUpperCase(ch))
	                result.append(Character.toLowerCase(ch));
	            else
	                result.append(ch);
	        }
	        System.out.println("Case converted string: " + result);
	}

}
