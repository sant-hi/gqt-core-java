package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class SubStringIndex {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String s = sc.nextLine();
		        System.out.println("Substring(2,5): " + s.substring(2,5));
		        System.out.println("Index of 'a': " + s.indexOf('a'));
		        System.out.print("Enter another string: ");
		        String s2 = sc.nextLine();
		        System.out.println("Strings equal? " + s.equals(s2));
		    }
		}


