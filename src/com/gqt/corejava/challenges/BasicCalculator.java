package com.gqt.corejava.challenges;
import java.util.Scanner;
public class BasicCalculator {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the first number: ");
	double num1 = scanner.nextDouble();
	System.out.print("Enter the operator (+, -, *, /): ");
	char operator = scanner.next().charAt(0);
	System.out.print("Enter the second number: ");
	double num2 =scanner.nextDouble();
	double result =calculate(num1, num2, operator);
	System.out.println("Result: " + result);
	}
	private static double calculate(double num1, double num2, char operator) {
	switch (operator) {
	case '+':
	return num1 + num2;
	case '-':
	return num1-num2;
	case '*':
	return num1* num2;
	case '/':
	if (num2!=0) {
    return num1/num2;
	} else {
	System.out.println("Error: Division by zero");
	System.exit(0);
	}
	default:
	System.out.println("Error: Invalid operator");
	System.exit(0);
	return 0;
}
}
}