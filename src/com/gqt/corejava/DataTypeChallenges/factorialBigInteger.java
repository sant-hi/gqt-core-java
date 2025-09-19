package com.gqt.corejava.DataTypeChallenges;
import java.math.BigInteger;
public class factorialBigInteger {

	public static void main(String[] args) {
		int n = 20;
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial of " + n + ": " + fact);

	}

}
