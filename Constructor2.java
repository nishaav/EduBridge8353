package com;

public class Constructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample sample=new Sample("Nisha",27,89.05);
		Sample1 sample1=new Sample1();
		sample1.show();
		sample.show();
	}
}
class Sample
{
	String name;
	int age;
	double percentage;
	public Sample(String name, int age, double percentage) {
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}	//this is a keyword that works as current class instance
	void show()
	{
		System.out.println(name+" "+age+" "+percentage);
	}
}
class Sample1
{	
	String name;
	int age;
	double percentage;
	
	void show()
	{
		System.out.println(name+" "+age+" "+percentage);
	}
}