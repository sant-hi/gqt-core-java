package core.gqt.corejava.Thread;

import java.util.Scanner;

class Operation1 extends Thread{
	@Override
	public void run() {
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
class Operation2 extends Thread{
	@Override
	public void run() {
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
class Operation3 extends Thread{
	@Override
	public void run() {
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
public class ThreadCode4 {
	public static void main(String[] args) {
		Operation1 op1=new Operation1();//thread object created
		Operation2 op2=new Operation2();//thread object created
		Operation3 op3=new Operation3();//thread object created
		op1.start();//op1 handed over to thread scheduler
		op2.start();
		op3.start();
	}

}

