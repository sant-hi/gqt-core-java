package com.gqt.corejava.challenges;
public class PowerCalculation {
		public static void main(String[] args) {
		int base = 2;
		int exponent=3;
		long result = calculatePower(base, exponent);
		System.out.println(base + " raised to the power " + exponent + " is: " +result);
		}
		private static long calculatePower(int base, int exponent) {
		if (exponent == 0) {
		return 1;
		} else {
		return base*calculatePower(base, exponent - 1);

		}
}
}

