package com.gqt.corejava.Strings;
import java.util.Scanner;
public class SumProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner sc = new Scanner(System.in);

		        // Input string
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        int sumCapitalVowels = 0;
		        int sumSmallVowels = 0;
		        long productConsonants = 1;
		        boolean hasConsonant = false;

		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		                sumCapitalVowels += ch;
		            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                sumSmallVowels += ch;
		            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
		                // It's a consonant (letter but not a vowel)
		                productConsonants *= ch;
		                hasConsonant = true;
		            }
		        }

		        System.out.println("Sum of capital vowels ASCII values: " + sumCapitalVowels);
		        System.out.println("Sum of small vowels ASCII values: " + sumSmallVowels);
		        if (hasConsonant) {
		            System.out.println("Product of consonant ASCII values: " + productConsonants);
		        } else {
		            System.out.println("No consonants found. Product not computed.");
		        }

		        sc.close();
		    }
		}


