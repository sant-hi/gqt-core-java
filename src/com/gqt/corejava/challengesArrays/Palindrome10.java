package com.gqt.corejava.challengesArrays;
import java.util.Scanner;
public class Palindrome10 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Size: ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        boolean isPalindrome = true;
		        System.out.print("Elements: ");
		        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

		        for(int i=0;i<n/2;i++) {
		            if(arr[i] != arr[n-1-i]) {
		                isPalindrome = false;
		                break;
		            }
		        }
		        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
		    }
		}
