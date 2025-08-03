package com.looping;

import java.util.Scanner;

public class NestedDoWhile {

	public static void main(String[] args) {
		
		//Marathi =Skilled - Skilled - 
		//1 seconds-waste - 1 utilize
		
		//SKIILED
		//10000+ pending competition  1
		
		//5000+ pending
		
//		for(int i=1;i<=10;i++)
//		{
//			for(int j=1;j<=10;j++)
//			{
//				System.out.println("Ram");
//			}
//			System.out.println("Shyam");
//		}
		
//		int i=1;
//		do
//		{
//			System.out.println("Ram");
//			i++;
//			int j=1;
//			do {
//				System.out.println("Shyam");
//				j++;
//				
//			}
//			while(j<=10);
//		}while(i<=10);
		
		
		//Online Shopping Application
		
	//Amazon - 1000 Developer 	-Updation , Check code
	//Client	
		
		int mainChoice;
		
		int subChoice;
		
		double balance=50000.00;
		Scanner sc=new Scanner(System.in);
		do  //outer do while
		{
			System.out.println("================Welcome to online Shopping ==============\n");
		
		
			System.out.println("1.Electronics");
			System.out.println("2.Clothes");
			System.out.println("3.Exit");
			
			System.out.println("Enter Choice..");
		
			mainChoice=sc.nextInt();
			
			if(mainChoice==1)
			{
				do  //inner do while
				{
					System.out.println("===Electronics Section===");
				    System.out.println("1.Headphones - 500Rs");
				    System.out.println("2.Iphone16 -90000Rs");
				    System.out.println("3.PowerBank -2000Rs");
				    System.out.println("4.Back to the main menu");
				    System.out.println("Enter your Choice..");
				
				    subChoice=sc.nextInt();
				    if(subChoice==1 && balance>=500)
				    {
				    	balance-=500;
				       System.out.println("Headphone Purchased..!Remaining Balance = "+balance);	
				    }
				    else if(subChoice==2 && balance>=90000)
				    {
				    	balance-=90000;
				    	System.out.println("Iphone Purchased..Remaining balance = "+balance);
				    }
				    else if(subChoice==3 && balance>=2000)
				    {
				    	balance-=2000;
				    	System.out.println("PowerBanks Purchased..Remaining Balance = "+balance);
				    }
				    else if(subChoice==4)
				    {
				    	System.out.println("returning to the main menu..");
				    }
				    else if(subChoice==1 || subChoice==2 || subChoice==3)
				    {
				    	System.out.println("Insufficient Funds...");
				    }
				    else 
				    {
				    	System.out.println("Invalid Choice");
				    }
				    
				}
				while(subChoice!=4);
			}
			else if(mainChoice==2)
			{
				//2 inner do while 
				do
				{
					System.out.println("=======Clothes Section=====");
					System.out.println("1.Tshirt -300Rs");
					System.out.println("2.Jeans - 800Rs");
					System.out.println("3.Back to the Main Menu");
				
				   System.out.println("Enter Choice");
				   
				   subChoice=sc.nextInt();
				   if(subChoice==1 && balance>=300)
				   {
					   balance-=300;
					   System.out.println("Tshirt Purchased...Remaining balance  : "+balance);
				   }
				   else if(subChoice==2 && balance>=800)
				   {
					   balance-=800;
					   System.out.println("Jeans Purchased...Remaining balance  : "+balance);
				   }
				   else if(subChoice==3)
				   {
					   System.out.println("Returning to the main menu");
				   }
				   else if(subChoice==1 || subChoice==2)
				   {
					   System.out.println("Insufficent Funds");
				   }
				   else
				   {
					   System.out.println("Invalid choice...");
				   }
				}
				while(subChoice!=3);
				
			}
			else if(mainChoice==3)
			{
				System.out.println("Thank you for shopping..");
			}
			else
			{
				System.out.println("Invalid Choice");
			}
					
		}
		while(mainChoice!=3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
