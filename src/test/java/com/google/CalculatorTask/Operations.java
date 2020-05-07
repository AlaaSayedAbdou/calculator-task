package com.google.CalculatorTask;

import java.util.Scanner;

public class Operations {

	Scanner firstNum;
	Scanner secoundNum;

	public float addation ()
	{

		firstNum=new Scanner(System.in);
		System.out.println("Enter The first number that you want to add ");
		float first=firstNum.nextFloat();


		secoundNum=new Scanner(System.in);
		System.out.println("Enter The secound number that you want to add ");
		float secound=firstNum.nextFloat();
		float add=first+secound;
		return add;
	}

	public float subtraction ()
	{
		firstNum=new Scanner(System.in);
		System.out.println("Enter The first number that you want to subtract  ");
		float first=firstNum.nextFloat();

		secoundNum=new Scanner(System.in);
		System.out.println("Enter The secound number that you want to subtract ");
		float secound=firstNum.nextFloat();
		float sub=first-secound;
		return sub;
	}

	public float multiplication ()
	{
		firstNum=new Scanner(System.in);
		System.out.println("Enter The first number that you want to multiple ");
		float first=firstNum.nextFloat();

		secoundNum=new Scanner(System.in);
		System.out.println("Enter The secound number that you want to multiple ");
		float secound=firstNum.nextFloat();
		float mul=first*secound;
		return mul;
	}

	public float division ()
	{
		firstNum=new Scanner(System.in);
		System.out.println("Enter The first number that you want to divide ");
		float first=firstNum.nextFloat();

		secoundNum=new Scanner(System.in);
		System.out.println("Enter The secound number that you want to divide ");
		float secound=firstNum.nextFloat();
		float div=first/secound;
		return div;
	}
}
