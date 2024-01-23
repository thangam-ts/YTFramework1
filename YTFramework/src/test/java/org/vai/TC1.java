package org.vai;

public class TC1 {
//All codes are written here
//METHODS in this section
	
	public void additionNumbers() {
		//Add two numbers
		int a=5, b=10;
		int sum = a+b;
		System.out.println("Print the Sum " +sum );
	}
	
	
	public static void main(String[] args) {
		//MAIN CLASS
		//object of the main class
		TC1 obj1 = new TC1();
		obj1.additionNumbers();
		
	}

}

/*
1. First create a MAVEN Project
2. Inside the src/test Folder create a PACKAGE
3. After creating the Package, right click on it & create a new CLASS
4. Inside the class write your code

*/