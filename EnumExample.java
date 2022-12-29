package com;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level var=Level.LOW;
		System.out.println(var);
		switch(var)
		{
			case LOW: System.out.println("Low Level");
						break;
			case MEDIUM: System.out.println("Medium Level");
						break;
			case HIGH: System.out.println("High Level");
						break;
			default: System.out.println("Invalid Value");
		}
	}

}

enum Level
{
	LOW,MEDIUM,HIGH
}