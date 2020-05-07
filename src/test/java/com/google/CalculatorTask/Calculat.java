package com.google.CalculatorTask;



import java.util.Scanner;

import org.testng.annotations.Test;

public class Calculat {
	@Test
	public void calculater() {

		Scanner operation=new Scanner(System.in);
		System.out.println("What is the operation yo want to do");
		System.out.println("if addation enter 'a'");
		System.out.println("if subtraction enter 's'");
		System.out.println("if multiplication enter 'm'");
		System.out.println("if multiplication enter 'd'");
		String op=operation.nextLine();

		while (! op.isEmpty()) {
			
			
		

		Operations numbers =new Operations();
		if(op.equals("a")) {
			float add=numbers.addation();
			System.out.println("the sumatiom is " +add +"\n");  
		}


		else if (op.equals("s")) {
			float sub=numbers.subtraction();

			System.out.println("the subtraction is " + sub +"\n");
		}
		
		else if (op.equals("m")){
			float mul=numbers.multiplication();
			System.out.println("the multiplication is " + mul +"\n");
		}
		

		else if(op.equals("d")){

			float div=numbers.division();
			System.out.println("the multiplication result  is " + div +"\n");
		}

		else {
			System.out.println("you must enter operation");
		}


		 operation=new Scanner(System.in);
		System.out.println("What is the operation yo want to do");
		 op=operation.nextLine();
		}

	}
}
