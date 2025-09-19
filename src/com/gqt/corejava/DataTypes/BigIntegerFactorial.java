package com.gqt.corejava.DataTypes;
import java.util.Scanner;
import java.math.BigInteger;
public class BigIntegerFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int n = sc.nextInt();
	        BigInteger fact = BigInteger.ONE;
	        for(int i=1;i<=n;i++)
	            fact = fact.multiply(BigInteger.valueOf(i));
	        System.out.println("Factorial: " + fact);
	}

}
