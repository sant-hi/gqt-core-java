package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class CharCase {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a character: ");
		        char ch = sc.next().charAt(0);
		        if(Character.isLowerCase(ch)) 
		            System.out.println("Uppercase: " + Character.toUpperCase(ch));
		        else 
		            System.out.println("Lowercase: " + Character.toLowerCase(ch));
		    }
		}


