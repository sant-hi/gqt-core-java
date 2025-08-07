package com.gqt.corejava.Strings;

public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1=new StringBuffer("Ramayana.");
		StringBuffer sb2=new StringBuffer("Is a mythological story.");
		sb1.append(sb2);
		System.out.println(sb1);
		
		StringBuilder sb3=new StringBuilder("Ramayana.");
		StringBuilder sb4=new StringBuilder("Is a mythological story.");
		sb3.append(sb4);
		System.out.println(sb3);
		
	}

}
