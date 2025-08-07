package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class OnlyDigitsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string to check digits: ");
	        String input = sc.nextLine();

	        if (input.matches("\\d+"))
	            System.out.println("String contains only digits.");
	        else
	            System.out.println("String contains other characters too.");
	}

}
