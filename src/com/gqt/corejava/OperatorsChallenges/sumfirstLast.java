package com.gqt.corejava.OperatorsChallenges;
import java.util.Scanner;
public class sumfirstLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int last = num % 10;
        int first = num;
        while (first >= 10) {
            first /= 10;
        }
        System.out.println("Sum = " + (first + last));
	}
}
