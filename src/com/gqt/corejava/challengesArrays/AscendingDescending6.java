package com.gqt.corejava.challengesArrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class AscendingDescending6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        System.out.print("Elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Descending: " + Arrays.toString(arr));
	}

}
