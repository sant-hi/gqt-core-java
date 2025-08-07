package com.gqt.corejava.Strings;

public class StringCode2 {

	public static void main(String[] args) {
				String s1="RAMA";
				String s2="RAMA";
				String s3="rama";
				String s4="SITA";
				System.out.println("Case-1 Same String");
				if(s1.equalsIgnoreCase(s2)==true) {
					System.out.println("Strings equal");
				}
				else {
					System.out.println("Strings not equal");
				}
				System.out.println("=====================================");
				if(s1==s2) {
					System.out.println("References equal");
				}
				else {
					System.out.println("Reference not equal");
				}
				System.out.println("=====================================");
				System.out.println("Case-2 Same String different case");
				if(s1.equalsIgnoreCase(s3)==true) {
					System.out.println("Strings equal");
				}
				else {
					System.out.println("Strings not equal");
				}
				System.out.println("=====================================");
				if(s1==s3) {
					System.out.println("References equal");
				}
				else {
					System.out.println("Reference not equal");
				}
				System.out.println("=====================================");
				System.out.println("Case-3  different string");
				if(s1.equalsIgnoreCase(s4)==true) {
					System.out.println("Strings equal");
				}
				else {
					System.out.println("Strings not equal");
				}
				System.out.println("=====================================");
				if(s1==s4) {
					System.out.println("References equal");
				}
				else {
					System.out.println("Reference not equal");
				}
				}
}
