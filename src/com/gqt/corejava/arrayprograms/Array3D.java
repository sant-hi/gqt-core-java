/**
 * 
 */
package com.gqt.corejava.arrayprograms;

/**
 * 
 */

import java.util.Scanner;
class ArrayOperations1{
	String[][][] arr;
    Scanner sc = new Scanner(System.in);

    // Create the array to store marks of students
    void createArray() {
        System.out.print("Enter the School count: ");
        int sch = sc.nextInt();
        System.out.print("Enter the class count in each school: ");
        int cls = sc.nextInt();
        System.out.print("Enter the student count in each class: ");
        int std = sc.nextInt();
        arr = new String[sch][cls][std];
        System.out.println("Array Created");
        System.out.println("------------------");
    }

    // Collecting & storing marks of students

    void collectData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter data for School " + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  Class " + (j + 1) + ": ");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("    Enter name for Student " + (k + 1) + ": ");
                    arr[i][j][k] = sc.next();
                }
            }
        }
        System.out.println("Data Collected");
        System.out.println("------------------");
    }

    // Display marks stored inside the array
    void displayData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("School " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  Class " + (j + 1) + ":");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("    Student " + (k + 1) + " Marks = " + arr[i][j][k]);
                }
            }
        }
    }
}

public class Array3D {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations1 a= new ArrayOperations1();

        a.createArray();

        a.collectData();

        a.displayData();
	}

}
