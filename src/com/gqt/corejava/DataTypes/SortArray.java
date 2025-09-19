package com.gqt.corejava.DataTypes;
import java.util.Scanner;
import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));
        System.out.print("Descending: ");
        for(int i=n-1;i>=0;i--) System.out.print(arr[i] + " ");
	}

}
