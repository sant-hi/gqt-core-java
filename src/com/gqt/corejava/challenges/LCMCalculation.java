package com.gqt.corejava.challenges;
public class LCMCalculation {
		public static void main(String[] args) {
		int num1= 12;
		int num2= 18;
		int lcm =calculateLCM(num1, num2);
		System.out.println("LCM of " + num1+ " and "+ num2+" is: "+lcm);
		}
		private static int calculateLCM(int a, int b) { 
			int gcd =calculateGCD(a, b);
		    return (a*b)/gcd;
		}
		private static int calculateGCD(int a, int b) {
		while (b!=0){
		int temp = b;
		b=a%b;
		a = temp;
		}
		return a;
}
}
