package com;

public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[]{12,23,34,45};
		Demo demo=new Demo(ar,"Kriti");//object creation
		demo.show();//
	}

}
/*
 * Constructor :
 * without constructor, we cannot create the object
 * constructors are specially created to initialize the member variables/instance variable/non-static variables of the class
 * 
 */
class Demo
{
	Demo(int num[],String str)
	{
		System.out.println("Hii!! I am a default constructor");
	}
	void show()
	{
		System.out.println("dummy");
	}
}
