package com;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learner12 learner=new Learner12(12,"Nitin");
		Learner12 learner1=new Learner12(learner);
		System.out.println(learner.id+" "+learner.name);
		System.out.println(learner1.id+" "+learner1.name);
	}

}
class Learner12
{
	int id;
	String name;
	public Learner12(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Learner12(Learner12 learner)//copy constructor
	{
		this.id = learner.id;
		this.name = learner.name;
	}
	

}

class A
{
	int a,b;
	//class members can be of any type
	//variables/constructors/methods/class(nested class->inner class)
	class B
	{
		
		
	}
}

//Target : access modifier and nested classes
/*Copy constructor :
 * ->copies reference->duplicates the object
 * ->change the value of one object only. 
 * ->clone of object
 * 
 * ->to avoid the use of clone method
 * ->to create an object with multiple fields
 * 
 * 
 *
 */


