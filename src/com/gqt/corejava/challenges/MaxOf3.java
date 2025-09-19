package com.gqt.corejava.challenges;

public class MaxOf3 {
		public static void main(String[] args) {
		int num1 = 12;
		int num2 = 8;
		int num3 = 15;
		int max = (num1 > num2)? (num1 > num3? num1:num3): (num2 > num3 ? num2: num3);
		System.out.println("Maximum of " + num1 + "," + num2 + ", and " + num3 + " is: " + max);
		}
		}

