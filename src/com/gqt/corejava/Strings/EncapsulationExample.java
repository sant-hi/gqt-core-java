package com.gqt.corejava.Strings;

class Lion{
	private String name;
	private String color;
	private String country;
	private int age;
	
	void setData1() {
		name="Kiran";
		color="yellow";
		country="Africa";
		age=9;
	}
	
	void setData2(String a,String b,String c,int d) {
		name=a;
		color=b;
		country=c;
		age=d;
	}
	void getData() {
		System.out.println("Name="+name);
		System.out.println("Color="+color);
		System.out.println("Country="+country);
		System.out.println("Age="+age);
		}
}
public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
		//l.name="rama";//private members cannot be accessed outside the class
		//l.color="white";//private members cannot be accessed outside the class
		//l.country="india";//private members cannot be accessed outside the class
		//l.age=7;//private members cannot be accessed outside the class
		l.setData1();
		l.getData();
		System.out.println("--------------------------");
		l.setData2("Ramu","white","india",14);
		l.getData();
	}

}
