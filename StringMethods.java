package com;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="java Programming";
		System.out.println(str.toUpperCase());//
		System.out.println(str.toLowerCase());
		System.out.println(str.endsWith("inG"));//false
		System.out.println(str.endsWith("ing"));//true
		System.out.println(str.startsWith("Ja"));//false
		System.out.println(str.startsWith("ja"));//true
		String str1="    String Implementation Methods      ";
		System.out.println(str1.trim());//String Implementation Methods
		System.out.println(str1.strip());//String Implementation Methods
		System.out.println(str1.stripLeading());
		System.out.println(str1.stripTrailing());
		System.out.println(str.contains("ming"));//content and case-sensitivity 
		
		
		
	}
	

}
