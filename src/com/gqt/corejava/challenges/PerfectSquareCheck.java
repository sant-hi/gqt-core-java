package com.gqt.corejava.challenges;
public class PerfectSquareCheck {
		public static void main(String[] args) {
		int number = 25;
		double squareRoot = Math.sqrt(number);
		boolean isPerfectSquare = squareRoot - Math.floor(squareRoot) == 0;
		if (isPerfectSquare) {
		System.out.println(number + " is a perfect square.");
		} else {
		System.out.println(number + " is not a perfect square.");
		}
		}
		}

