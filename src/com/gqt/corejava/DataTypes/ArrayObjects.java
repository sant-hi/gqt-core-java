package com.gqt.corejava.DataTypes;
import java.util.Scanner;
class Student {
    String name;
    int age;
}
public class ArrayObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student arr[] = new Student[n];
        for(int i=0;i<n;i++) {
            arr[i] = new Student();
            System.out.print("Enter name: ");
            arr[i].name = sc.next();
            System.out.print("Enter age: ");
            arr[i].age = sc.nextInt();
        }
        System.out.println("Student details:");
        for(int i=0;i<n;i++)
            System.out.println(arr[i].name + " " + arr[i].age);
	}

}
