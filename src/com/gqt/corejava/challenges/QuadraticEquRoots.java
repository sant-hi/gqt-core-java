package com.gqt.corejava.challenges;
import java.util.Scanner;
public class QuadraticEquRoots {
	public static void main(String[] args){
	Scanner scanner =new Scanner(System.in);
	System.out.print("Enter the coefficients (a, b, c) of the quadratic equation");
	double a= scanner.nextDouble();
	double b= scanner.nextDouble();
	double c= scanner.nextDouble();
	double discriminant=b * b - 4 * a * c;
	if (discriminant > 0) {
	double root1=(-b + Math.sqrt(discriminant))/(2*a);
	double root2 = (-b-Math.sqrt(discriminant))/(2*a);
	System.out.println("Roots are real and different. Root1="+root1+",Root2="+ root2);
	} else if (discriminant == 0) {
	double root=-b/(2*a);
	System.out.println("Roots are real and same. Root" + root);
	} else {
	double realPart=-b/(2*a);
	double imaginaryPart = Math.sqrt(-discriminant)/(2*a);
	System.out.println("Roots are complex. "+ "Root1="+realPart+"+"+ imaginaryPart + "i, "
			+ "Root2 = " + realPart+"-" + imaginaryPart + "i");
	}
	}
	}

