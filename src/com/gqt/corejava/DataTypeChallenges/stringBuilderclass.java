package com.gqt.corejava.DataTypeChallenges;
public class stringBuilderclass {
	public static void main(String[] args) {
		 StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, " Java");
	        sb.delete(0, 5);
	        System.out.println(sb.toString());
	}

}
