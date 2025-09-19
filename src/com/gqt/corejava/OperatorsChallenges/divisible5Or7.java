package com.gqt.corejava.OperatorsChallenges;
import java.util.Scanner;
public class divisible5Or7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 7 == 0)
            System.out.println("Divisible by both 5 and 7");
        else
            System.out.println("Not divisible by both 5 and 7");
	}
}
