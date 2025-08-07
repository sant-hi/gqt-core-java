package com.gqt.corejava.Strings;
import java.util.Scanner;
public class ReverseAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        
        //step1-Counting spaces 
        int spc_count=0;
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)==' ') {
        		spc_count++;
        	}
        }
        //step 2 Find word count
        int word_count =spc_count+1;
        
        //step3 create array based on word count
        String arr[] =new String[word_count];
        
        //step 4 traverse the string and strore into the array
        int temp=arr.length-1;
        String temp_str="";
        for(int i=str.length()-1;i>=0;i--) {
        	if(str.charAt(i)!=' ') {
        		temp_str= temp_str + str.charAt(i);
        	}
        	else {
        		arr[temp]=temp_str;
        		temp--;
        		temp_str="";
        		
        	}
        }
        arr[temp]=temp_str;
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
	}

}
