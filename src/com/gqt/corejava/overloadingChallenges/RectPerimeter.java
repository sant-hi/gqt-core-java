package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class RectPerimeter {
	    static int perimeter(int l, int w) {
	        return 2 * (l + w);
	    }
	    static double perimeter(double l, double w) { 
	        return 2 * (l + w);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter length and width: ");
	        double l = sc.nextDouble(), w = sc.nextDouble();
	        System.out.println("Perimeter = " + perimeter(l, w));
	    }
	}

