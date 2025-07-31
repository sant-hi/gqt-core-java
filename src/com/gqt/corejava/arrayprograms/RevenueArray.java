/**
 * 
 */
package com.gqt.corejava.arrayprograms;

/**
 * 
 */
import java.util.Scanner;



class ArrayOperations3 {



  long[][][] revenue;

   long invest;

   long lastYearRev;
   long sum_rev;

    Scanner sc = new Scanner(System.in);



    void createArray() {

        System.out.println("Enter the no. of categories:");

        int cat = sc.nextInt();

        System.out.println("Enter the no. of languages:");

        int lang = sc.nextInt();

        System.out.println("Enter the no. of movies:");

        int mov = sc.nextInt();



        revenue = new long[cat][lang][mov];



        System.out.println("Enter current total investment:");

        invest = sc.nextLong();



        System.out.println("Enter last year revenue:");

        lastYearRev = sc.nextLong();



        System.out.println("Array created");

        System.out.println("--------------");

    }



    void collectData() {

        for (int i = 0; i < revenue.length; i++) {

            System.out.println("Enter data for Category " + (i + 1));

            for (int j = 0; j < revenue[i].length; j++) {

                System.out.println("  Language " + (j + 1));

                for (int k = 0; k < revenue[i][j].length; k++) {

                    System.out.print("    Enter revenue for Movie " + (k + 1) + ": ");

                    revenue[i][j][k] = sc.nextLong(); // ✅ fixed from rev to revenue
                    sum_rev+=revenue[i][j][k];
                }

            }

        }

        System.out.println("Data collected and calculated");

        System.out.println("-----------------");

    }



    void displayData() {

        double totalRev = 0;

        for (int i = 0; i < revenue.length; i++) {

            System.out.println("Category " + (i + 1));

            for (int j = 0; j < revenue[i].length; j++) {

                System.out.println("  Language " + (j + 1));

                for (int k = 0; k < revenue[i][j].length; k++) {

                    System.out.println("    Movie " + (k + 1) + " Revenue = ₹" + revenue[i][j][k] + " crores");

                    // ✅ fixed from sc.revenue to revenue

                }

            }

        }



        System.out.println("----------------");

        System.out.println("Total Revenue: ₹" +sum_rev + " crores");



        if (sum_rev > invest) {

            System.out.println("Hemanth made a PROFIT of ₹" + (sum_rev - invest) + " crores");

        } else {

            System.out.println("Hemanth made a LOSS of ₹" + (invest - sum_rev) + " crores");

        }



        if (sum_rev > lastYearRev) {

            System.out.println("This year's performance is BETTER than last year");

        } else {

            System.out.println("This year's performance is NOT BETTER than last year");

        }

    }

}
public class RevenueArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayOperations3 ao = new ArrayOperations3();

        ao.createArray();

        ao.collectData();

        ao.displayData();
	}

}
