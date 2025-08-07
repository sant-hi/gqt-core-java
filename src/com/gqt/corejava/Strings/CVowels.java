package com.gqt.corejava.Strings;

import java.util.Scanner;

public class CVowels {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		int cvowel_count=0;
		int svowel_count=0;
	
		
		
		for( int i=0;i<str.length();i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z' ) {
			if(str.charAt(i)=='A' || str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
					cvowel_count++;
			}
		}
		}
		
		for( int j=0;j<str.length();j++) {
			if(str.charAt(j)>='a' && str.charAt(j)<='z' ) {
			if (str.charAt(j)=='a' || str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u') {
				svowel_count++;
			}
		}
		}
		System.out.println("the Capital vowel count="+cvowel_count);
		System.out.println("the Small Vowel count="+svowel_count);

}
}
