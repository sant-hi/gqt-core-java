package com.gqt.Exception;
import java.util.Scanner;
class Operation1{
	void function1() throws Exception{
		System.out.println("Inside function -1");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second number:");
		int n2=sc.nextInt();
		
		int res = n1/n2;
		
		System.out.println(res);
		System.out.println("Outoff function -1");
	}
}

class Operation2{
	void function2() throws Exception{
		System.out.println("Inside function -2");
		Operations1 op1=new Operations1();
		op1.function1();
		System.out.println("Outoff function -2");
	}
}


class Operation3{
	void function3() throws Exception{
		System.out.println("Inside function -3");
		Operations2 op2=new Operations2();
		try {
			op2.function2();
		}catch(Exception e) {
			System.out.println("Exeception handled in function_3");
		}
		System.out.println("Outoff function -3");
	}
}

public class Launch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside,main function");
		Operations3 op3=new Operations3();
		op3.function3();
		System.out.println("Outoff,main function");
	}

}
