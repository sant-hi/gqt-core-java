package com.gqt.corejava.DataTypeChallenges;
public class transposeMatrix {
	public static void main(String[] args) {
		 int[][] mat = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };
		        int[][] trans = new int[3][2];

		        for (int i = 0; i < mat.length; i++) {
		            for (int j = 0; j < mat[0].length; j++) {
		                trans[j][i] = mat[i][j];
		            }
		        }
		        System.out.println("Transpose:");
		        for (int[] row : trans) {
		            for (int val : row) {
		                System.out.print(val + " ");
		            }
		            System.out.println();
		        }
	}

}
