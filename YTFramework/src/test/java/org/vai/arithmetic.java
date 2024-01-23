package org.vai;

import java.util.Scanner;

public class arithmetic {

		public void multiMethod(int a, int b)
		{
			//int a=15, b=60;
			int multiplication = a*b;
			System.out.println("print the multiplication "+ multiplication);
		}
		public void sum(int a, int b)
		{
			//int a=15, b=60;
			int sum = a+b;
			System.out.println("print the sum "+ sum);
		}
		
		public void substraction( int a , int b)
		{
			//int a=15, b=60;
			int substraction = a-b;
			System.out.println("print the substraction "+ substraction);
		}
		
		public void division(int a , int b)
		{
			//int a=180, b=60;
			int division = a/b;
			System.out.println("print the division "+ division);
		}
		
		public static void main(String[] args) {
			
			arithmetic obj1 = new arithmetic();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the number a ");
			int a= input.nextInt();
			
			System.out.println("Enter the number b ");
			int b= input.nextInt();
			//Parameterized & Non parameterized or Default methods
			
			obj1.multiMethod(a, b); // Parameters 
			obj1.sum(a,b);
			obj1.substraction(a, b);
		obj1.division (a,b);
			
		}

	}

