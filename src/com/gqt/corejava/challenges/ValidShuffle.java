package com.gqt.corejava.challenges;

public class ValidShuffle {
 public static void main(String[] args) {
	String str1="abc";
	String str2="def";
	String shuffle="adbcef";
	boolean isValidShuffle=isValidShuffle(str1, str2, shuffle);
	if (isValidShuffle) {
	System.out.println(shuffle +"is a valid shuffle of"+ str1+" and "+str2);
	} else {

	System.out.println(shuffle +"is not a valid shuffle of" +str1+" and " +str2);
	}
 }
	private static boolean isValidShuffle(String str1, String str2, String shuffle) {
		int i=0,j=0, k=0;
	while (k<shuffle.length()) {
		if (i<str1.length() && str1.charAt(i) == shuffle.charAt(k)) { 
			i++;	
		} else if (j < str2.length() && str2.charAt(j) ==shuffle.charAt(k)) {
			j++;
			}else {
				return false;
				}
		k++; 
	}
		return i== str1.length() && j == str2.length();
	}	
}

