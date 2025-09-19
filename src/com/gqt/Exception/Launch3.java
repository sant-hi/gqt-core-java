package com.gqt.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;
//try with 
public class Launch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc= new Scanner(System.in);
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
		catch (ArithmeticException ae){
			System.out.println("Arithmetic Exception Occured and handled in catch block");
		}
		
		catch (InputMismatchException ime){
			System.out.println("Input Mismatch Exception Occured and handled in catch block");
		}
		
		catch (NegativeArraySizeException nae){
			System.out.println("Negative Array Size Exception Occured and handled in catch block");
		}
		
		catch (ArrayIndexOutOfBoundsException aie){
			System.out.println("Array Index Out Of Bounds Exception Occured and handled in catch block");
		}
		
		//Generic Catch
		catch (Exception e) {
			System.out.println(" Exception Occured and handled in catch block");
		}
		
	}

}
