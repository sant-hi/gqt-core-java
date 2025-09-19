package com.gqt.corejava.ArrayChallenges;
import java.util.Scanner;

public class Intersection9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Size of array 1: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.print("Elements of array 1: ");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Size of array 2: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.print("Elements of array 2: ");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        System.out.print("Intersection: ");
        for (int i = 0; i < n1; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) continue;
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
