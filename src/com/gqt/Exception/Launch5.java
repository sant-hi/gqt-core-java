package com.gqt.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			
			System.out.println("Enter the first number:");
			int n1=sc.nextInt();
			System.out.println("Enter the second number:");
			int n2=sc.nextInt();
			
			int res = n1/n2;
			
			System.out.println(res);
			System.out.println("-------------------");

			System.out.println("Array operations ");
			System.out.println("Enter the array size:");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.println("Enter the value to be added: ");
			int val= sc.nextInt();
			
			System.out.println("Enter the position to which value to be added: ");
			int pos = sc.nextInt();
			arr[pos]=val;
			
			System.out.println("Value Added");
			
		}
		// specific multi-catch
		catch (ArithmeticException ae){
			System.out.println("Arithmetic Exception Occured and handled in catch block");
		}
		finally {
			sc.close();
			System.out.println("Scanner is closed");
		}
	}

}
