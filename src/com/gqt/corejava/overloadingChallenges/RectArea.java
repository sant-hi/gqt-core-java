package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class RectArea {
	    static int area(int l, int w) {
	        return l * w;
	    }
	    static double area(double l, double w) { // overloaded
	        return l * w;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter length and width: ");
	        double l = sc.nextDouble(), w = sc.nextDouble();
	        System.out.println("Area = " + area(l, w));
	    }
}
