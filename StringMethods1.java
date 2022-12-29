package com;

import java.util.Arrays;

public class StringMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="Welcome User To String Learning In Java";
//		byte b[]=str.getBytes();//convert string into byte array
//		System.out.println(b);
//		System.out.println(Arrays.toString(b));//print the content of an array
//		String username="nishajaiswal";
//		if(username.equals("NishaJaiswal"))
//		{
//			System.out.println("Matches");
//		}
//		else
//		{
//			System.out.println("Does Not Match");
//		}
//
//		if(username.equalsIgnoreCase("NishaJaiswal"))
//		{
//			System.out.println("Matches");
//		}
//		else
//		{
//			System.out.println("Does Not Match");
//		}
//		
//		System.out.println(str.indexOf("U"));//8
//		System.out.println(str.lastIndexOf("a"));//38 33
//		System.out.println(str.substring(4,18));//4-17	
//		System.out.println(username.replace("a","@"));
//		System.out.println(username.replaceFirst("a", "@"));
//		
		// wap to replace second occurence of 'a' in username literal with '@' 
//		String sample="Sugahasini";
//		System.out.println(sample);
//        int count=0;
//        for(int i=0;i<sample.length();i++){
//            if(sample.charAt(i)=='a'){
//            	  count++;
//                if(count==2){
//                   System.out.println(sample.substring(0,i)+'@'+sample.substring(i+1));
//                   
//                }
//              
//            }
//        }
//        System.out.println(sample);
		//option 1
		
		
		
		
		
		
		
		
		
		
		String word="abh@gny@ sama";
		System.out.println(word);
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a')
			{
				count++;
			
			if(count==2)
			{
				//0 to i-1 i skipped(@) i+1
				System.out.println(word.substring(0,i)+"@"+word.substring(i+1));
			}
			}
		}
		
		//split method
		//split(delimiter or pattern)
		String arr[]=word.split("@");
		for(String s:arr)//enhanced for loop compatible to be used with arrays or when we are not sure about the size
		{
			System.out.println(s);
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);	
		}
		char ch[]= {'A','M','A','N'};
		for(char c:ch)//enhanced for loop
		{
			System.out.println(c);
		}
		System.out.println(word.repeat(3));
		//intern
		String s1="Java";//SCP
		String s2=new String("Java");//Heap area
		String s3=s2.intern();
		if(s1==s2)
		{
			System.out.println("matches");
		}
		else
		{
			System.out.println("not matches");
		}
		//intern() will shift the object from heap to SCP to make it a string literal
		if(s1==s3)
		{
			System.out.println("matches");
		}
		else
		{
			System.out.println("not matches");
		}
		
	
		
		
		
	}

}
