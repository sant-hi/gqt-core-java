package com.gqt.corejava.challenges;

public class SqrtWitoutMath {
		public static void main(String[] args) {
		double number = 25;
		double squareRoot = squareRoot(number);
		System.out.println("Square root of " + number + " is: " + squareRoot);
		}
		private static double squareRoot(double num) {
		double guess = num / 2;
		double epsilon = 0.0001;
		while (Math.abs(guess * guess - num) > epsilon) {
		guess = (guess + num / guess) / 2;
		}
		return guess;
		}
		}

