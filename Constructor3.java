package com;

public class Constructor3 {

		public static void main(String args[])	
		{
			Data data=new Data();
			Data data1=new Data(6549);
			Data data2=new Data(6549D);
			Data data3=new Data(6549,78);
			System.out.println();
		}
}
class Data
{//constructor overloading
	//polymorphism : multiple forms of a single entity
	//poly :many
	//morphos: form
	//Human Being : friend, child,learner, customer, passengers, tourist, employee
	
	//change the number of parameters, or change the type of parameters
	Data()
	{
		System.out.println("Default constructor of the class");
	}
	Data(double a)
	{
		System.out.println("Parameterised with parameter a of double type");
	}
	Data(int a)
	{
		System.out.println("Parameterised with parameter a of int type");
	}
	
	Data(int a,int  b)
	{
		System.out.println("Parameterised with parameter a and b");
	}
}