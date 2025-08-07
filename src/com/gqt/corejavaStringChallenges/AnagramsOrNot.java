package com.gqt.corejavaStringChallenges;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

	        char[] a1 = str1.toCharArray();
	        char[] a2 = str2.toCharArray();
	        Arrays.sort(a1);
	        Arrays.sort(a2);

	        if (Arrays.equals(a1, a2))
	            System.out.println("Strings are anagrams.");
	        else
	            System.out.println("Not anagrams.");
	}

}
