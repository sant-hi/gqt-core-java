package core.gqt.corejava.Thread;

import java.util.Scanner;

class Addition{
	void add() {
		System.out.println("Addition Operation Started");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1=sc.nextInt();
		System.out.println("Enter the second number:");
		int num2=sc.nextInt();
		int res= num1+num2;
		System.out.println("Result="+res);
		System.out.println("Addition Operation Completed");
	}
}
class Printing{
	void print() {
		System.out.println("Printing Operation Started");
		for(int i=1;i<10;i++) {
			System.out.println("Happy 6 years GQT");
			try {
	        Thread.sleep(3000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
	}
		System.out.println("Printing Operation Completed");
	}
}
class Banking{
	void bank() {
				Scanner sc= new Scanner(System.in);
				System.out.println("Banking Operation Started");
				System.out.println("Enter the account no:");
				int accno=sc.nextInt();
				System.out.println("Enter the pin no:");
				int pin=sc.nextInt();
				System.out.println("Data entered");
				System.out.println("Banking Operation Completed");
			}
		}
public class ThreadCode3 {
public static void main(String[] args) {
	Addition a=new Addition();
	Printing p=new Printing();
	Banking b=new Banking();
	a.add();
	p.print();
	b.bank();
}
}
