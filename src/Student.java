package com.oop;

class Student {

	String name;
	
	int age; //memory 4 bytes = 121212
	
	String address;
	
	long moNo;
	
	
	public static void main(String[] args) {
		
		//How to create Object
		//ref.var => It will store/hold the address of an object
		//new -> it will allocate the memory to  our object
		//ClassName  ref.variable = new ClassName();
		//hashCode-> unique for each object 
		
		//Create a Class User - id , username , email, password , age , address , mo.no
		//create 10 Object for User
		//inializate that and print that
		
		Student s1 = new Student();
		s1.name="Ram";
		s1.address="Pune";
		s1.age=23;
		s1.moNo=9034934843L;
		
		System.out.println("Name   : "+s1.name);
		System.out.println("Address: "+s1.address);
		System.out.println("Age    : "+s1.age);
		System.out.println("Mo.No  : "+s1.moNo);
		
		System.out.println("============================");
		Student s2 = new Student();
		s2.name="Shyam";
		s2.address="mumbai";
		s2.age=24;
		s2.moNo=9839483432L;
		
		System.out.println("Name   : "+s2.name);
		System.out.println("Address: "+s2.address);
		System.out.println("Age    : "+s2.age);
		System.out.println("Mo.No  : "+s2.moNo);
		
		
		//we can create any no.of object of one class..
		
	}
	
	
}
