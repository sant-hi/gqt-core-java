package com.gqt.corejava.challenges;

import java.util.Scanner;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        // Input array elements
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Remove duplicates using stream
        int[] uniqueArray = Arrays.stream(array).distinct().toArray();

        // Output the result
        System.out.println("Array after removing duplicates:");
        for(int value : uniqueArray) {
            System.out.print(value + " ");
        }
    }
}
