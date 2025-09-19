package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class StringBuilderDemo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StringBuilder sb = new StringBuilder();
	        System.out.print("Enter a string: ");
	        sb.append(sc.nextLine());
	        System.out.println("Reversed: " + sb.reverse());
	    }
	}


