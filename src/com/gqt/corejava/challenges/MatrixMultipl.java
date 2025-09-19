package com.gqt.corejava.challenges;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class MatrixMultipl {
		public static void main(String[] args) {
		int[][] matrix1={
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
		};
		int[][] matrix2 = { 
	    {9, 8, 7},
		{6, 5, 4},
		{3, 2, 1}
		};
		int rows1= matrix1.length;
		int columns1 = matrix1[0].length;
		int rows2 =matrix2[0].length;
		int columns2= matrix2[0].length;
		if (columns1 != rows2) {
		System.out.println("Matrix multiplication is not possible."); 
		return;}
		int[][]result = new int[rows1][columns2];
		ExecutorService executorService =Executors.newFixedThreadPool(rows1);
		for (int i = 0;i<rows1;i++) {
			Runnable task= new MatrixRowMultiplier(matrix1, matrix2, result, i);
			executorService.execute(task);
		}
			executorService.shutdown();
			while (!executorService.isTerminated()) {
			}
			System.out.println("Matrix 1");
			printMatrix(matrix1);
			System.out.println("Matrix 2:");
			printMatrix(matrix2);
			System.out.println("Matrix Multiplication Result");
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
			class MatrixRowMultiplier implements Runnable {
			private final int[][] matrix1;
			private final int[][] matrix2;
			private final int[][] result;
			private final int row;
			public MatrixRowMultiplier(int[][] matrix1, int[][] matrix2, int[][] result, int row) {
			this.matrix1= matrix1;
			this.matrix2= matrix2;
			this.result= result;
			this.row= row;
			}
			@Override
			public void run() {
			for (int i = 0; i < matrix2[0].length; i++) {
			result[row][i] = 0;
			for (int j = 0; j < matrix1[0].length; j++) {
			result[row][i] += matrix1[row][j] * matrix2[j][i];
			}
			}
			}
			}
	

