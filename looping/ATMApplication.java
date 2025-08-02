package com.looping;

import java.util.Scanner;

public class ATMApplication {

	//ODD EVEN , Positive negative
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//TO read inout from user
		
		int pin=1212; //we have set the pin
		
		double balance=5000.00;
		
		int attempt=0;//3 attempts will provide to user
		
		//Outer while loop
		   //0 < 3
		while(attempt<3)
		{
			 System.out.println("Enter your Pin : ");
			 int userPin=sc.nextInt();
			  //1212 == 1212
			 if(pin==userPin)
			 {
				 System.out.println("Login SuccessFul...");
				 int choice=0;
				      //4!=4
				 while(choice!=4)
				 {
					 System.out.println("========ATM MENU==========");
				     System.out.println("1.Check Balance");
				     System.out.println("2.Deposit");
				     System.out.println("3.Withdraw");
				     System.out.println("4.Exit");
				     
				     System.out.println("\nEnter Your Choice..");
				     
				     choice=sc.nextInt();
				     
				     if(choice==1)
				     {
				    	 System.out.println("Your Balance is : "+balance);
				     }
				     else if(choice==2)
				     {
				    	 System.out.println("Enter Amount to Deposit");
				    	 
				    	 int deposit=sc.nextInt();
				    	 
				    	 if(deposit>0)
				    	 {
				    		 balance+=deposit;
				    		 System.out.println("Deposited ..After deposit balance = "+balance);
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Invalid Amount");
				    	 }
				    	 
				     }
				     else if(choice==3)
				     {
				    	 System.out.println("Enter Amount to Withdraw");
				    	 int withdraw=sc.nextInt();
				    	 if(withdraw>0 && withdraw<=balance)
				    	 {
				    		 balance-=withdraw;
				    		 System.out.println("Withdrawn : after withdraw := "+balance);
				    	 }
				    	 else
				    	 {
				    		 System.out.println("Invalid amount or Insufficient funds");
				    	 }
				    	 
				     }
				     else if(choice==4)
				     {
				    	 System.out.println("Thank Your for Using ATM..");
				     }
				     else
				     {
				    	 System.out.println("Invalid Choice...");
				    	
				     }
				 
				    
				 }
				 
				 break; //it used to end your outer loop
			 }
			 else
			 {
				 attempt++; //3
				 System.out.println("Wrong Pin : Attempts Left : "+(3-attempt));
			 
			     if(attempt==3)
			     {
			    	 System.out.println("Account Blocked...Too Many Attemtps");
			     }
			 }
			 
			 
		}
		
		
		
		
		
		
		
	}
}
