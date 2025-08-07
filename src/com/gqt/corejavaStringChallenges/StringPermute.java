package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class StringPermute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string to find permutations: ");
	        String input = sc.nextLine();
	        permute("", input);
	    }

	    static void permute(String prefix, String str) {
	        int n = str.length();
	        if (n == 0)
	            System.out.println(prefix);
	        else {
	            for (int i = 0; i < n; i++)
	                permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
	        }
	}

}
