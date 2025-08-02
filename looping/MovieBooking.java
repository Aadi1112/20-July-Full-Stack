package com.looping;

import java.util.Scanner;

public class MovieBooking {

	public static void main(String[] args) {
		
		//syx.do while
		//if you want to execute your code atleast once without checking condition
		//initialization
		//do
//		{
//			//code
//			//updation
//		}
		//while(condition);
		
//		int i=1;
//		do
//		{
//			System.out.println("Ram");
//			i++;//11
//		}
//		while(i<=10);//1 2 3 4 5 6 7 8 9 10
//		
//		
		
		//Movie Booking 
		//Balance = 1000
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		double balance=1000;
		
		String movie="";
		
		int ticketPrice=0;
		
		
		do
		{
			
			System.out.println("\n==========Movie Ticket Booking System==========");
		
		   System.out.println("1.Book Ticket");
		   System.out.println("2.Check Balance");
		   System.out.println("3.Exit");
		   
		   System.out.println("\nEnter Your Choice");
		   
		   choice=sc.nextInt();
		   
		   if(choice==1)
		   {
			   System.out.println("\nSelect the Movie");
			   System.out.println("1.Saiyara(Rs.180)");
			   System.out.println("2.Pushpa2(Rs.150)");
			   System.out.println("3.Sant Dnayneshwarachi Muktai..(Rs.100)");
		       System.out.println("4.Sant Tukaram(Rs.125)");
		   
		       System.out.println("Enter Movie Choice..");
		       int movieChoice=sc.nextInt();
		       
		       if(movieChoice==1)
		       {
		    	   movie="Saiyara";
		    	   ticketPrice=180;
		       }
		       else if(movieChoice==2)
		       {
		           movie="Pushpa2";
		           ticketPrice=150;
		       }
		       else if(movieChoice==3)
		       {
		    	   movie="Sant Dnayneshwarachi Muktai..";
		    	   ticketPrice=100;
		       }
		       else if(movieChoice==4)
		       {
		    	   movie="Sant Tukaram";
		    	   ticketPrice=125;
		       }
		       else
		       {
		    	   System.out.println("Invalid Choice..");
		       }
		       
		       
		       System.out.println("Enter number of Tickets..");
		       
		       int tickets=sc.nextInt();
		       
		        double totalCost= tickets * ticketPrice;
		       
		        double remaningBalance=balance-totalCost;
		        if(totalCost<=balance)
		        {
		        System.out.println("Your Tickets Has Been Booked Successfully...");
		        
		        System.out.println("Movie : "+movie);
		        System.out.println("Tickets Booked : "+tickets);
		        System.out.println("TotalCost : "+totalCost);
		        System.out.println("Remaining Balance : "+remaningBalance);
		        }
		        else
		        {
		        	System.out.println("Total AMount require to Book Tickets : "+totalCost);
		        	System.out.println("Insufficient Balance to Book Ticket : "+balance);
		        }
		        
		    }
		   
		   
		   
		
		}
		while(false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
