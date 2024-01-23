package org.vai;

import java.util.Scanner;

public class imputEnterScanner {

			public void multiMethod(int a, int b)     //multiplication
			{
				int multiplication = a*b;
				System.out.println("print the multiplication "+ multiplication);
			}
			public void sum(int a, int b)     //addition
			{
				int sum = a+b;
				System.out.println("print the sum "+ sum);
			}
			
			public void substraction(int a, int b)  //subtraction
			{
				int substraction = a-b;
				System.out.println("print the substraction "+ substraction);
			}
			
			public void division(int a, int b) //division
			{
				int division = a/b;
				System.out.println("print the division "+ division);
			}

			public static void main(String[] args) {
			
				imputEnterScanner obj1 = new imputEnterScanner ();
				Scanner input = new Scanner(System.in);
			
				System.out.println("Enter the number a :");
				int a= input.nextInt();
				System.out.println("Enter the number b :");
				int b = input.nextInt();
				
				obj1.multiMethod(a,b);
				obj1.sum(a,b);
			    obj1.substraction(a,b);
			    obj1.division (a, b);
				
			}

	}
