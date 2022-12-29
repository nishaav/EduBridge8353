package com;

import java.util.StringTokenizer;

public class StringToken 
{
	public enum Day
	{
		MONDAY,TUESDAY,WEDNESDAY;
	}
	public static void main(String[] args) 
	{
		System.out.println(Day.MONDAY);
		// TODO Auto-generated method stub
		//to split the string on the basis of multiple delimiters
		String str="Welcome User@To%Java#Programming!Of Core Java";
		System.out.println(str);
		StringTokenizer st=new StringTokenizer(str," ");
		//token : the splitted strings by using the StringTokenizer class is referred as Tokens
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
