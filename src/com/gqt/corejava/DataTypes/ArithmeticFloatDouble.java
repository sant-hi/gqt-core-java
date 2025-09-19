package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class ArithmeticFloatDouble {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter two float numbers: ");
		        float a = sc.nextFloat();
		        float b = sc.nextFloat();
		        System.out.print("Enter two double numbers: ");
		        double x = sc.nextDouble();
		        double y = sc.nextDouble();
		        System.out.println("Float sum: " + (a+b));
		        System.out.println("Float product: " + (a*b));
		        System.out.println("Double sum: " + (x+y));
		        System.out.println("Double division: " + (x/y));
		    }
		}


