package com.gqt.corejava.challengesArrays;
import java.util.Scanner;
public class RotateLeftRight {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Size: ");
		        int n = sc.nextInt();
		        int[] array = new int[n];

		        System.out.print("Elements: ");
		        for (int i = 0; i < n; i++) {
		            array[i] = sc.nextInt();
		        }

		        System.out.print("Direction (L for left, R for right): ");
		        char dir = sc.next().toUpperCase().charAt(0);
		        System.out.print("Positions: ");
		        int k = sc.nextInt();
		        if (n == 0) return;
		        k = k % n; // normalize

		        for (int i = 0; i < k; i++) {
		            if (dir == 'L') {
		                int first = array[0];
		                for (int j = 0; j < n - 1; j++) {
		                    array[j] = array[j + 1];
		                }
		                array[n - 1] = first;
		            } else if (dir == 'R') {
		                int last = array[n - 1];
		                for (int j = n - 1; j > 0; j--) {
		                    array[j] = array[j - 1];
		                }
		                array[0] = last;
		            }
		        }

		        System.out.println("Array after rotation:");
		        for (int v : array) {
		            System.out.print(v + " ");
		        }
		    }
}
