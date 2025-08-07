package com.gqt.corejava.Strings;
import java.util.Scanner;
public class ImmutableProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string-1:");
		String str1=sc.next();
		System.out.println("Enter the string-2:");
		String str2=sc.next();
		
		str1=str1.concat(str2);
		System.out.println(str1);
	}

}
