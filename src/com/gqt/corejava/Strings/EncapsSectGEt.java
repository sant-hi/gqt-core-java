package com.gqt.corejava.Strings;

import java.util.Scanner;

class Dog2{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the age:");
age=sc.nextInt();
System.out.println("Enter the cost:");
cost=sc.nextInt();
public String getName() {
	System.out.println("Enter the name:");
	name=sc.nextLine();
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public String getColor() {
		System.out.println("Enter the color:");
		color=sc.nextLine();
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		System.out.println("Enter the breed:");
		breed=sc.nextLine();
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCost() {
		
		return cost;
	}

	public void setCost(int cost) {
		
		this.cost = cost;
		
	}
}
public class EncapsSectGEt {

	public static void main(String[] args) {
		Dog2 d1=new Dog2();
		d1.setName();
		d1.setColor();
		d1.setBreed();
		d1.setAge();
		d1.setCost();
		System.out.println(d1.getName());
		System.out.println(d1.getColor());
		System.out.println(d1.getBreed());
		System.out.println(d1.getAge());
		System.out.println(d1.getCost());
		
	    
		
	}

}
