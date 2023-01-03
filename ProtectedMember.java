package com;

import dummy.A;//

public class ProtectedMember extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedMember pm=new ProtectedMember();
		pm.age=10;
		pm.show();
		

	}
	void show()
	{
		System.out.println(age);
	}
}
