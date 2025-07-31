package com.gqt.corejava.challengesArrays;
import java.util.Scanner;
public class NegPosZeroCount {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Size: ");
		        int n = sc.nextInt();
		        int pos=0, neg=0, zero=0;
		        System.out.print("Elements: ");
		        for(int i=0;i<n;i++) {
		            int x = sc.nextInt();
		            if (x > 0) pos++;
		            else if (x < 0) neg++;
		            else zero++;
		        }
		        System.out.println("Positive = " + pos + ", Negative = " + neg + ", Zero = " + zero);

	}

}
