package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of strings: ");
	        int n = sc.nextInt();
	        sc.nextLine();
	        String[] arr = new String[n];
	        System.out.println("Enter the strings:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextLine();

	        String prefix = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            while (arr[i].indexOf(prefix) != 0) {
	                prefix = prefix.substring(0, prefix.length() - 1);
	                if (prefix.isEmpty()) break;
	            }
	        }
	        System.out.println("Longest common prefix: " + (prefix.isEmpty() ? "None" : prefix));
	}

}
