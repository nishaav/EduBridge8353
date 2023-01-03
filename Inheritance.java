package com;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.a=20;
		b.show();
		b.display();
	}
}
class A1
{
	int a;
	void show()
	{
		System.out.println("Value of a is "+a);
	}
}
class B extends A1//class Derived extends Base
{
	void display()
	{
		System.out.println("Creating my own method");
	}
}




/*
 * 
 * Object
 * 
 *Inheritance means code reusability
 *
 *Inheritance means creating IS-A relationship among classes to reutilise the properties of the parent by child classes 
 * 
 *'extends' keyword 
 *
 * class A
 * {
 * 		//variable
 * 		int a;
 * 
 * 		//methods
 * 		void add()
 * 		{
 * 		
 * 		}
 * }
 * 
 * class B extends A
 * {
 * 		int c;
 * 		void display()
 * 		{
 * 			
 * 		}
 * }
 * 
 * "Every class in java is a child class of Object"
 * 
 * Types 
 * 1)Single 
 * 2)Multi-level
 * 3)hierarchial 
 * 
 *
 */