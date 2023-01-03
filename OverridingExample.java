package com;

public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Circle();
		//whenever we are creating upcasted object, the properties belonging to parent will be accessible.
		//but the overridden definition of the same.
		// Using the upcasted object, we cannot call the property belongs to child class itself
		shape.radius=20;
		Shape shape2=new Sphere();
		shape2.radius=10;
		shape.area();//3.14*20*20
		shape2.area();//4*3.14*10*10
		Shape shape3=new Shape();
		shape3.area();
	}
}
class Shape
{
	int radius;
	float PI=3.14f;
	void area()
	{
		System.out.println("Calculate area as per shape formula");
	}
}
//abstraction
//nested classes
//homework : encapsulation

//circle
class Circle extends Shape
{
	void area()
	{
		System.out.println("The area is "+(PI*radius*radius));
	}
	void volume()
	{
		System.out.println("Calculate volume for Circle");
	}
}
class Sphere extends Shape
{
	void area()
	{
		System.out.println("The area is "+(4*PI*radius*radius));
	}
}