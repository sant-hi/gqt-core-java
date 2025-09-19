package com.gqt.corejava.overloadingChallenges;
import java.util.Scanner;
public class SpherVol {
	    static double volume(int r) {
	        return (4.0/3) * Math.PI * r * r * r;
	    }
	    static double volume(double r) { 
	        return (4.0/3) * Math.PI * r * r * r;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius: ");
	        double r = sc.nextDouble();
	        System.out.println("Volume = " + volume(r));
	    }
}
