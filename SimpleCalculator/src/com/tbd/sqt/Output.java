package com.tbd.sqt;
import java.util.Scanner;  // Import the Scanner class

public class Output {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // Declare input from scanner that take System.in

		System.out.print("What operation you wish? ('+', '-', '*', '/'): \n");
		String operator = sc.next();
		System.out.printf("Operator was: %s \n", operator);

		System.out.print("Please enter 1st number: ");
		double numberOne = sc.nextInt();

		System.out.print("Please enter 2nd number: ");
		double numberTwo = sc.nextInt();

		Calculator calcObj = new Calculator(numberOne, numberTwo);
		calcObj.calc(operator);
		calcObj.getResult();

	}

}
