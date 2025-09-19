package com.gqt.corejava.DataTypes;
import java.util.Scanner;
public class MultiplyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols of first matrix: ");
        int r1 = sc.nextInt(), c1 = sc.nextInt();
        System.out.print("Enter rows and cols of second matrix: ");
        int r2 = sc.nextInt(), c2 = sc.nextInt();
        if(c1 != r2) {
            System.out.println("Multiplication not possible");
            return;
        }
        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        System.out.println("Enter first matrix:");
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter second matrix:");
        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                b[i][j] = sc.nextInt();
        int res[][] = new int[r1][c2];
        for(int i=0;i<r1;i++)
            for(int j=0;j<c2;j++)
                for(int k=0;k<c1;k++)
                    res[i][j] += a[i][k] * b[k][j];
        System.out.println("Resultant matrix:");
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c2;j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
	}

}
}
