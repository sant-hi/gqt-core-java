package com.gqt.corejava.Strings;

public class BuiltInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "SachinRameshTendulker";
//1.length()
		int len=str.length();
		System.out.println(len); 
		// it will provide the total length of the string.
		
		
//2.charAt()
		 char c=str.charAt(0);
		 System.out.println(c);
		 // it will provide the character at the specified position.
		 
		 
		 //c=str.charAt(100);//it will lead to IndexOutOfBounds exception as we have only 21 positions.
		 //system.out.println(c);
		 
		 
//3.concat()
		 String str1=str.concat(" is the best batsman in the world");
		 System.out.println(str1);
		 //it merges the contents of 2 strings
		 
		 
//4.contains()
		 boolean res1=str.contains("Ramesh");
		 System.out.println(res1);
		 //it will check if the substring is present in the main string
		 
		 
//5.endsWith()
		 boolean res2=str.endsWith("Tendulker");
		 System.out.println(res2);
		 //it will check if substring present at the end of the main string 
		 
		 
//6.startWith()		
		 boolean res3=str.startsWith("Sachin");
		 System.out.println(res3);
		 
		 
//7.getClass()
		 Class class1=str.getClass();
		 System.out.println(class1);
		 // it will provide the root class path of the object.
		 
		 
//8.hashCode()
		 long hc=str.hashCode();
		 System.out.println(hc);
		 //it will return the hash value of the given object.
		 
		 
//9.indexOf()
		 int i=str.indexOf('e');
		 System.out.println(i);
		 // it will return the index of the specific character in the main string.
		 
		 
//10.isBlank()
		boolean b=str.isBlank();
		System.out.println(b);
		String str2="          ";
		b=str2.isBlank();
		System.out.println(b);
		//checks if the string is empty or has only spaces.
		String str3="";
		b=str3.isBlank();
		System.out.println(b);
		
		
//11.isEmpty()
		
		
		
	}

}
