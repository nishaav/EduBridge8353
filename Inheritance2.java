package com;

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a2=new B2();//upcasting -> the properties belonging to parent class only is callable
		a2.a=10;
		a2.show();
		//a2.display();
	}
}
class A2
{
	int a;
	void show()
	{
		System.out.println("Value of a is "+a);
	}
}
class B2 extends A2//class Derived extends Base
{
	void display()
	{
		System.out.println("Creating my own method");
	}
	//overriding : one can redefine the methods of parent without changing the structure
	void show()
	{
		System.out.println("Redefined method");
	}	
}