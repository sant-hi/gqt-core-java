package com.gqt.corejava.challenges;
public class MatrixAddition {
	public static void main(String[] args) {
	int[][] matrix1 = {
	{1, 2, 3},
    {4, 5, 6},
    {17,8,9}};
	int[][] matrix2={
	{19,8,7},
	{6, 5, 4},
	{3, 2, 1}
	};
	int rows = matrix1.length;
	int columns = matrix1[0].length;
	int[][] result = new int[rows][columns];
	for (int i=0; i < rows; i++) {
	for (int j = 0; j < columns; j++){
	result[i][j] = matrix1[i][j] + matrix2[i][j];
	}
	}
	System.out.println("Matrix 1:");
	printMatrix(matrix1);
	System.out.println("Matrix 2:");
	printMatrix(matrix2);
	System.out.println("Matrix Addition Result:");
	printMatrix(result);
	}
	private static void printMatrix(int[][] matrix) {
	for (int[] row: matrix) {
	for (int element: row) {
	System.out.print(element + " ");
	}
	System.out.println();
	}
	System.out.println();
	}
	}

