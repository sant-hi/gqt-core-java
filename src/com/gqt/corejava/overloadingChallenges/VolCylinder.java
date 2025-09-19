package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class VolCylinder {
	    static double volume(double r, double h) {
	        return Math.PI * r * r * h;
	    }
	    static double volume(int r, int h) {
	        return Math.PI * r * r * h;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius and height: ");
	        double r = sc.nextDouble(), h = sc.nextDouble();
	        System.out.println("Volume = " + volume(r, h));
	    }
	}
