package com;

public class Inheritance3 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D3 d3=new D3();
		d3.a=10;
		d3.b=20;
		d3.c=90;
		d3.disp();
		d3.print();
		d3.show();
	}
}
class D1
{
	int a;
	void print()
	{
		System.out.println("The value of a is "+a);
	}
}
class D2 extends D1
{
	int b;
	void disp()
	{
		System.out.println("The value of a and b is "+a+" "+b);
	}
}
class D3 extends D2
{
	int c;
	void show()
	{
		System.out.println("The value of a , b and c is "+a+" "+b+" "+c);
	}
	
}