package com.gqt.Exception;
import java.util.Scanner;
	class Operation11{
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

	class Operation22{
		void function2() throws Exception{
			System.out.println("Inside function -2");
			Operation1 op1=new Operation1();
			op1.function1();
			System.out.println("Outoff function -2");
		}
	}


	class Operation33{
		void function3() throws Exception{
			System.out.println("Inside function -3");
			Operation22 op2=new Operation22();
			try {
				op2.function2();
			}catch(Exception e) {
				System.out.println("Exeception handled in function_3");
				throw e;
			}
			System.out.println("Outoff function -3");
		}
	}

	public class Launch7 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("inside,main function");
			Operation33 op3=new Operation33();
			try {
			op3.function3();
			}
			catch (Exception e){
				
			System.out.println("Exception Handled in main.");
		}

	}

}
