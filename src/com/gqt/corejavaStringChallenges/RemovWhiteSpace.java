package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class RemovWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string with spaces: ");
	        String input = sc.nextLine();
	        String noSpaces = input.replaceAll("\\s", "");
	        System.out.println("String without spaces: " + noSpaces);
	}

}
