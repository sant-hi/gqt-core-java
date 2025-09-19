package com.gqt.corejava.DataTypeChallenges;
class Student {
    String name;
    int age;
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println(name + " " + age);
    }
}
public class arrayofObjects {
	public static void main(String[] args) {
		 Student[] arr = new Student[2];
	        arr[0] = new Student("John", 20);
	        arr[1] = new Student("Alice", 22);
	        for (Student s : arr) {
	            s.display();
	        }
	}
}
