package com.conditional;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Income");

		double income = sc.nextDouble();

		if (income >= 1000000) {
			System.out.println("30% Tax");

			double taxAmount = income * 0.30;

			System.out.println("Tax Amount need to Pay :" + taxAmount);
		} else if (income < 1000000 && income > 500000) {
			System.out.println("20% Tax");
			double taxAmount = income * 0.20;

			System.out.println("Tax Amount need to Pay :" + taxAmount);
		} else if (income < 500000 && income > 200000) {
			System.out.println("10% Tax");
			double taxAmount = income * 0.10;

			System.out.println("Tax Amount need to Pay :" + taxAmount);

		} else {
			System.out.println("No TAX");
		}

//		int day=sc.nextInt();
//		
//		if(day==1)
//		{
//			System.out.println("Monday");
//		}
//		else if(day==2)
//		{
//			System.out.println("Tuesday");
//		}
//		else if(day==3)
//		{
//			System.out.println("Wednsday");
//		}
//		else if(day==4)
//		{
//			System.out.println("Thursdya");
//		}
//		else if(day==5)
//		{
//			System.out.println("Friday");
//		}
//		else if(day==6)
//		{
//			System.out.println("Saturday");
//		}
//		else
//		{
//			System.out.println("Sunday");
//		}

//		double marks=sc.nextDouble();
//		
//		if(marks>=90)//56 >= 90
//		{
//			System.out.println("Grade A");
//		}      //56 < 90     56 >=75
//		else if(marks<90 && marks>=75)
//		{
//			System.out.println("Grade B");
//		}       //56<75   56>=55
//		else if(marks<75 && marks >=55)
//		{
//			System.out.println("Grade C");//stop
//		}
//		else if(marks<55 && marks >=35)
//		{
//			System.out.println("Grade D");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		// Else if
//		if(condition)
//		{
//			//code //stop
//		}
//		else if(condition)
//		{
//		   //code  stop	
//		}
//		else if(condition)
//		{
//			//code stop
//		}
//		else
//		{
//		   //code	
//		}

//		Scanner sc=new Scanner(System.in);//Use hot nahi
//		
//		System.out.println("Enter A number");
//		
//		int num=sc.nextInt();
//		//13 % 2 =1 == 0
//		if(num % 2 == 0)
//		{
//			System.out.println("Even Number");
//		}
//		else
//		{
//			System.out.println("Odd Number");
//		}

//		if(num>0)
//		{
//			System.out.println("Positive Number");
//		}
//		else {
//		System.out.println("Negative Number");
//		}

//		double bankBalance=4000.00;
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Amount...");
//		
//		double amount=sc.nextDouble();
//		
//		if(amount <= bankBalance)
//		{
//			bankBalance -= amount;
//			System.out.println("Remaining Balance is : "+bankBalance);
//		}
//		else
//		{
//			System.out.println("Insufficient balance");
//		}
//		

		// if else , else if , return
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your Name");
//		
//		String name=sc.next();
//		   //2 < 3
//		if(name.length()<3)
//		{
//			System.out.println("name should be atleast above 3 characters");
//		}
//		else
//		{
//			System.out.println("Your Name is : "+name);
//
//		}
//		
//		
//		System.out.println("Enter Your Password");
//		
//		
//		String password=sc.next();
//		
//		if(password.length()<3)
//		{
//			System.err.println("password should be atleast above 3 characters");
//
//		}
//		else
//		{
//			System.out.println("Your Password is : "+password);
//		}
//		
//		
//		if(name.equals("Ram") && password.equals("1212"))
//		{
//			System.out.println("Login Successs");
//		}
//		else
//		{
//			System.out.println("Login Failed");
//		}
//		

//		String name="Aadiandjava";

//		System.out.println(name.length());
//		String name2="Aadiandjava";
//		System.out.println(name.equals(name2));

//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter Your Age...");
//		
//		int age=sc.nextInt();
//		
//		
//		if(age<18)//false
//		{
//			System.out.println("You are Child");
//		}
//		
//		if(age>=18  && age<40)
//		{
//			System.out.println("You are Young");
//		}
//		
//		if(age>40)
//		{
//			System.out.println("You are old");
//		}
//		
//		if(true) //condition - Any boolean result is called condition
//		{
//		System.out.println("Hello");
//		
//		System.out.println("Hi");
//		
//		System.out.println("Ram");
//		
//		System.out.println("Shyam");
//		}
//		
//		System.out.println("Outside if");
	}
}
