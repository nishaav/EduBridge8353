package com;

public class AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnerDetails learner=new LearnerDetails();
		learner.learnerName="Kartik";
		//learner.learnerId=324;
	}

}

class LearnerDetails
{
	private int learnerId=10;//private member accessible within class
	String learnerName;//default member accessible outside the class
	
	void show()
	{
		int a=10;//local variable accessible within method
		System.out.println(learnerId);
	}
	void showName()
	{
		System.out.println(learnerName);
	}
}
/*
 * 
 * 4 access modifiers 
 * 
 * private
 * default : not need to be specified
 * protected
 * public
 * 
 * 
 * 
 * 
 * 
 * 
 */
