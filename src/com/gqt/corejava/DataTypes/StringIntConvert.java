package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class StringIntConvert {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number as string: ");
		        String str = sc.next();
		        int num = Integer.parseInt(str);
		        System.out.println("Integer value: " + num);
		        System.out.println("String from integer: " + String.valueOf(num));
		    }
		}

