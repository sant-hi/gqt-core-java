package com.gqt.corejava.arrayprograms;

import java.util.Scanner;

public class MatrixArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Matrix 1
        System.out.print("Enter number of rows for Matrix 1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix 1: ");
        int c1 = sc.nextInt();

        int[][] matrix1 = new int[r1][c1];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print("matrix1[" + i + "][" + j + "] = ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix 2
        System.out.print("Enter number of rows for Matrix 2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns for Matrix 2: ");
        int c2 = sc.nextInt();

        int[][] matrix2 = new int[r2][c2];
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print("matrix2[" + i + "][" + j + "] = ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        if (c1 == r2) {
            int[][] resultMultiplication = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        resultMultiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            System.out.println("\nMatrix Multiplication Result:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(resultMultiplication[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix multiplication not possible (columns of Matrix 1 != rows of Matrix 2).");
        }

        // Matrix Addition
        if (r1 == r2 && c1 == c2) {
            int[][] resultAddition = new int[r1][c1];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    resultAddition[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }

            System.out.println("\nMatrix Addition Result:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    System.out.print(resultAddition[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("\nMatrix addition not possible (dimensions do not match).");
        }

        sc.close();
    }
}
