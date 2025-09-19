package com.gqt.corejava.challenges;

public class TrapezoidArea {
		public static void main(String[] args) {
		double base1 = 5;
		double base2 = 7;
		double height = 4;
		double area = calculateTrapezoidArea(base1, base2, height);
		System.out.println("Area of the trapezoid: " + area);
		}
		private static double calculateTrapezoidArea(double basel, double base2, double height) {
		return 0.5 * (basel + base2) * height;
		}
		}

