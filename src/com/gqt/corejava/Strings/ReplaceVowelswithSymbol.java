package com.gqt.corejava.Strings;
import java.util.Scanner;
public class ReplaceVowelswithSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner sc = new Scanner(System.in);

		        // Get input from the user
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        // Initialize an empty result string
		        String result = "";

		        // Loop through each character
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		            // Replace based on character
		            switch (ch) {
		                case 'a': case 'A':
		                    result += "$";
		                    break;
		                case 'e': case 'E':
		                    result += "3";
		                    break;
		                case 'i': case 'I':
		                    result += "*";
		                    break;
		                case 'o': case 'O':
		                    result += "@";
		                    break;
		                case 'u': case 'U':
		                    result += "&";
		                    break;
		                default:
		                    result += ch;
		            }
		        }

		        // Print the modified string
		        System.out.println("Modified string: " + result);

		        sc.close();
		    }
		}

	