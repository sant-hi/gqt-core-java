package com.gqt.corejava.DataTypeChallenges;
public class Wrapperclass {

	public static void main(String[] args) {
		int a = 10;
        Integer obj = Integer.valueOf(a);
        int b = obj.intValue();

        System.out.println("Primitive: " + a);
        System.out.println("Wrapper: " + obj);
        System.out.println("Unboxed: " + b);

	}

}
