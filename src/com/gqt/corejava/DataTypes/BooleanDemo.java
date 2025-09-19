package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class BooleanDemo {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter first number: ");
		        int a = sc.nextInt();
		        System.out.print("Enter second number: ");
		        int b = sc.nextInt();
		        boolean result = a > b;
		        System.out.println("Is first greater than second? " + result);
		    }
		}


