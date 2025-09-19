package com.gqt.corejava.DataTypeChallenges;

public class stringtoInteger {

	public static void main(String[] args) {
		String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("String to int: " + num);

        String back = String.valueOf(num);
        System.out.println("Int to String: " + back);

	}

}
