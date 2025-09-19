package com.gqt.corejava.challenges;

public class CompIntrest {
		public static void main(String[] args) {
		double principal = 1000;
		double rate = 0.05;
		int time = 2;
		double compoundInterest = principal * Math.pow((1+ rate), time) -principal;
		System.out.println("Compound interest after " + time + " years: " +compoundInterest);
}
}
