package com.gqt.corejavaStringChallenges;
import java.util.Scanner;
public class SubstringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String main = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        if (main.contains(sub))
            System.out.println("It is a substring.");
        else
            System.out.println("Not a substring.");
	}

}
