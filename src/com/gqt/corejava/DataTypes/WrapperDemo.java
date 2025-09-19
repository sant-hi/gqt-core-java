package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class WrapperDemo {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        Integer i = Integer.valueOf(10);
		        Double d = Double.valueOf(5.5);
		        System.out.println("Integer object: " + i);
		        System.out.println("Double object: " + d);
		        int num = i.intValue();
		        double val = d.doubleValue();
		        System.out.println("Primitive int: " + num);
		        System.out.println("Primitive double: " + val);
		    }
		}

