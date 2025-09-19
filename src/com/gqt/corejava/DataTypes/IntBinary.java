package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class IntBinary {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int num = sc.nextInt();
		        String binary = Integer.toBinaryString(num);
		        System.out.println("Binary: " + binary);
		        System.out.print("Enter binary: ");
		        String bin = sc.next();
		        int decimal = Integer.parseInt(bin, 2);
		        System.out.println("Decimal: " + decimal);
		    }
		}
