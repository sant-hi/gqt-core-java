/**
 * 
 */
package com.gqt.corejava.arrayprograms;

/**
 * 
 */
import java.util.Scanner;



class ArrayOperations2 {

    String[][][] arr;

    Scanner sc = new Scanner(System.in);



    // Create the array to store student data

    void createArray() {

        System.out.print("Enter the number of schools: ");

        int schools = sc.nextInt();



        arr = new String[schools][][];



        for (int i = 0; i < schools; i++) {

            System.out.print("Enter the number of classes in School " + (i + 1) + ": ");

            int classes = sc.nextInt();

            arr[i] = new String[classes][];



            for (int j = 0; j < classes; j++) {

                System.out.print("Enter number of students in Class " + (j + 1) + " of School " + (i + 1) + ": ");

                int students = sc.nextInt();

                arr[i][j] = new String[students];

            }

        }



        System.out.println("Array Created");

        System.out.println("------------------");

    }



    // Collect data

    void collectData() {

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Enter data for School " + (i + 1) + ":");

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println("  Class " + (j + 1) + ":");

                for (int k = 0; k < arr[i][j].length; k++) {

                    System.out.print("    Enter name/marks of Student " + (k + 1) + ": ");

                    arr[i][j][k] = sc.next();

                }

            }

        }

        System.out.println("Data Collected");

        System.out.println("------------------");

    }



    // Display data

    void displayData() {

        for (int i = 0; i < arr.length; i++) {

            System.out.println("School " + (i + 1) + ":");

            for (int j = 0; j < arr[i].length; j++) {

                System.out.println("  Class " + (j + 1) + ":");

                for (int k = 0; k < arr[i][j].length; k++) {

                    System.out.println("    Student " + (k + 1) + " = " + arr[i][j][k]);

                }

            }

        }

    }

}
public class Array3D1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations2 a = new ArrayOperations2();

	    a.createArray();

	    a.collectData();

	    a.displayData();
	}

}
