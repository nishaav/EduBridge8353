package com;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*int ar[]=new int[5];//single-dimensional array declaration
		// 0 1 2 3 4
		int ar1[]= {12,43,56,768,89};//declaration and initialization 
		
		//user-interaction
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<=4;i++)
		{
			ar[i]=scanner.nextInt();
		}
		System.out.println("The resultant array is : ");
		System.out.println(ar);//classname@hashcode
		for(int i=0;i<=4;i++)
		{
			System.out.print(ar[i]+" ");
		}
*/
		/*
		Scanner scanner=new Scanner(System.in);
		int ar[][]=new int[2][3];
		int ar1[][]= {{12,23,34},{45,56,67}};
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				ar[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<=1;i++)
		{
			
			System.out.print(ar[i]+" : ");
			for(int j=0;j<=2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		*/
		
		
		//find the highest number from 1 -d array initialized by user

		Scanner scanner = new Scanner (System.in);
		int size = scanner.nextInt();
		int [] arr = new int [size];
		
		for(int i=0; i<arr.length; i++){
		    arr[i] = scanner.nextInt();
		}
		
		int arr2[]=arr.clone();//shallow copy 
		//12 23 2 34 20
		//max=12
//		int max = arr[0];//LHS RHS
//		for(int i=1; i<arr.length; i++){
//		    if(arr[i] > max){
//		        max = arr[i];
//		    }
//		}

		Student ar[]=new Student[1];
		Student student1=new Student();
		student1.studentId=12;
		student1.sname="Jatin";
		Student ar1[]=ar.clone();//copy of data 
		
		
		
		
		//System.out.println(max);
		System.out.println("arr : ");		

		for(int i=0; i<arr.length; i++){
		    
			System.out.print(arr[i]+" ");
		}
System.out.println("arr2 : ");		
for(int i=0; i<arr2.length; i++){
		    
			System.out.print(arr2[i]+" ");
		}
		
		
		//i=1
		// arr[1]=23
		//23>12
		//max=23
		//i=2
//		arr[2]=2
		//2>23
		//i=3
		//arr[3]=34
		
		//34>23
		//max=34
		//i=4
//arr[4]=20
		//20>34
		//i=5

		
		
	}

}
/*
 *Array : 
 *
 * homogeneous collection of elements
 * contiguous memory allocation
 * array stores the elements on the basis of index
 * 
 *  index=0 or position=1
 *  ->arrays are treated as objects in java
 *	->easy to access
 * 	->arrays(contiguous) are faster than variables(randomly)
 *  
 *int array size 5
 * int 5 variable
 *
 * types :
 * 1)single - dimensional
 * 2)multi-dimensional or jagged array
 * 
 * 
 * syntax :
 * single : D
 * datatype arrayname[]=new datatype[size];
 * 
 * 
 * multi-dimensional :
 * datatype arrayname[][]=new datatype[row][column];
   array of arrays//collection of arrays
 *
 */

class Student
{
	int studentId;
	String sname;
	
}