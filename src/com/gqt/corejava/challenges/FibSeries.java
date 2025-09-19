package com.gqt.corejava.challenges;
public class FibSeries {
		public static void main(String[] args) {int limit = 10;
		System.out.println("Fibonacci series up to limit " + limit + ":");
		printFibonacciSeries(limit);
		}
		private static void printFibonacciSeries(int limit) {
		int num1 = 0, num2 = 1;
		for (int i = 1; i <= limit; i++) {
		System.out.print(num1 + " ");
		int sum = num1 + num2;
		num1 = num2;
		num2 = sum;
		}
		}
		}

