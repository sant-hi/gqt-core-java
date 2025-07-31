package com.gqt.corejava.arrayprograms;

import java.util.Scanner;

class ArrayOperations4 {

    String[][][] arr;
    String[] collegeNames;
    Scanner sc = new Scanner(System.in);

    void createArray() {
        System.out.print("Enter the number of colleges: ");
        int clg = sc.nextInt();
        sc.nextLine(); // consume newline

        arr = new String[clg][][];
        collegeNames = new String[clg];

        for (int i = 0; i < clg; i++) {
            System.out.print("Enter the name of college " + (i + 1) + ": ");
            collegeNames[i] = sc.nextLine();

            System.out.print("Enter the number of classes in " + collegeNames[i] + " College: ");
            int classes = sc.nextInt();
            arr[i] = new String[classes][];

            for (int j = 0; j < classes; j++) {
                System.out.print("Enter the capacity in Class " + (j + 1) + " of " + collegeNames[i] + " College: ");
                int cap = sc.nextInt();
                arr[i][j] = new String[cap];
            }
            sc.nextLine(); // consume newline after integer
        }

        System.out.println("Array Created");
        System.out.println("------------------");
    }

    void collectData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter data for " + collegeNames[i] + " College:");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  Class " + (j + 1) + ":");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print("    Enter name of Student " + (k + 1) + ": ");
                    arr[i][j][k] = sc.next();
                }
            }
        }

        System.out.println("Data Collected");
        System.out.println("------------------");
    }

    void displayData() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(collegeNames[i] + " College:");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("  Class " + (j + 1) + ":");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("    Student " + (k + 1) + " = " + arr[i][j][k]);
                }
            }
        }
    }

    void calculateRevenueAndStudents() {
        long totalRevenue = 0;

        System.out.println("\n----------- FINANCIAL REPORT -----------");

        for (int i = 0; i < arr.length; i++) {
            int studentCount = 0;

            for (int j = 0; j < arr[i].length; j++) {
                studentCount += arr[i][j].length;
            }

            long fee = 0;

            // Basic if-else (no switch)
            String name = collegeNames[i].toLowerCase();
            if (name.equals("medical")) {
                fee = 2500000L;
            } else if (name.equals("engineering")) {
                fee = 350000L;
            } else if (name.equals("degree")) {
                fee = 80000L;
            } else {
                fee = 100000L; // Default fee for unknown colleges
            }

            long revenue = studentCount * fee;
            totalRevenue += revenue;

            System.out.println("Total Students in " + collegeNames[i] + " College: " + studentCount);
            System.out.println("Fee per Student in " + collegeNames[i] + " College: ₹" + fee);
            System.out.println(collegeNames[i] + " College Revenue: ₹" + revenue);
            System.out.println("----------------------------------------");
        }

        System.out.println("Total Revenue for Financial Year: ₹" + totalRevenue);
        System.out.println("----------------------------------------");
    }
}

public class EducationalTrust {
    public static void main(String[] args) {
        ArrayOperations4 a = new ArrayOperations4();
        a.createArray();
        a.collectData();
        a.displayData();
        a.calculateRevenueAndStudents();
    }
}
