package com.conditional;

import java.util.Scanner;

public class NestedIf {
	//18 to 25 = 27 28 29 = 2 hour
	//PainfulLife == BeautifulLife
	
	// //Simple   Medium   Highlevel => =>OOPS , 
	
	// Online Movie Ticket Booking System
	//MBA =IT 
	// Age > 18 
	
	// Age > 60 => 30%
	
	// Age < 60 > 18 => 20%
	
	//Avilable Seats = 20 
	
	//1 Ticket Price= 200 * 10 = - discount = Final Price

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Student Admission
		System.out.println("Enter Age...");
		int age=sc.nextInt();
		
		System.out.println("Enter Marks");
		int marks=sc.nextInt();
		
		System.out.println("Enter Caste(GEN/SC/ST)");
		String caste=sc.next();
		
		
		if(age>=18 && age<=25)
		{
			if(marks>=60)
			{
				if(marks>=85)
				{
					System.out.println("Admission Granted under merit Seat");
				}
				else if(marks>=60 && marks<85)
				{
					if(caste.equals("SC") || caste.equals("ST"))
					{
						System.out.println("Admission Granted under reservation seat");
					}
					else
					{
						System.out.println("Admission Granted under genral seat");
					}
				}
			}
			else
			{
				System.out.println("Admission Denied : Marks less than 60");
			}
		}
		else
		{
			System.out.println("Admission Denied :Age Must be 18 or above and below 25");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int productPrice=sc.nextInt();
//		boolean isPrimeUser=true;
//		
//		if(productPrice>500)
//		{
//			if(isPrimeUser==true)
//			{
//				System.out.println("Extra 10% Discount");
//			    
//				 double discount=productPrice * 0.10;
//			   
//				 System.out.println("Final amount to Pay : "+(productPrice-discount));
//			}
//			else
//			{
//				System.out.println("5% discount applied");
//			}
//		}
//		else
//		{
//			System.out.println("No Discount available");
//		}
//		
//		
//		
//		
		
		//		double balance = 10000.00;

//		System.out.println("Enter amount for withdraw..");
//
//		int amount = sc.nextInt();
//
//		if (amount > 0) // ctrl + shift + f => format the code
//		{
//			if (amount <= balance) {
//				if (amount % 100 == 0 || amount % 500 == 0) {
//					balance -= amount;
//					System.out.println("Withdraw Success :" + balance);
//				} else {
//					System.out.println("Enter the amount in multilple of 100");
//				}
//
//			} else {
//				System.out.println("Insufficient Balance");
//			}
//		} else {
//			System.out.println("Invalid Amount");
//		}

//		System.out.println("Enter Your Marks");
//		int marks=sc.nextInt();
//		
//		if(marks>=35) //outer if
//		{
//			if(marks>=75) //inner if
//			{
//				System.out.println("Distinction");
//			}
//			else if(marks<75 && marks>=60)
//			{
//				System.out.println("First Class");
//			}
//			else
//			{
//				System.out.println("Pass");
//			}
//		}
//		else
//		{
//			System.out.println("Fail");
//		}
	}
}
