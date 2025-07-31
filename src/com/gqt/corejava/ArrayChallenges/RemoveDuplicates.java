package com.gqt.corejava.ArrayChallenges;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicates {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Size: ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        System.out.print("Elements: ");
		        int[] uniqueArray = Arrays.stream(arr).distinct().toArray();
				System.out.println("Array after removing duplicates:");
				for(int value: uniqueArray) {
					System.out.print(value+"");
		    }
		}

	}


