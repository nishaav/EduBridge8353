package dummy;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter two numbers for division : ");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();

		try
		{
			System.out.println(num1/num2);
		}
		catch(Exception e)
		{//Exception e=new ArithmeticException("/ by zero");
			System.out.println(e);
		}
		System.out.println("End of program!!");
	}
}
/*
 * Exception "
 * 1)CheckedException : compile time
 * 2)UncheckedException : runtime (because compiler cannot recognise it)
 * 
 * Domain Assessment--->Coding questions ()
 * HackerEarth HackerRank
 * 
 * Good quality of internet
 * swap the screens
 * Proctored 
 * Do Select Portal 
 * incognito mode
 * Read FAQs
 * Throwable\
 * ->Exception							->Error (irrecoverable) ->MemoryOutOfStack
 * 															    ->VirtualMachineError
 * -->RuntimeException
 * ---->ArithmeticException
 * ---->NullPointerException
 * ---->NumberFormatException
 * ---->IndexOutOfBoundsException
 * ------->ArrayIndexOutOfBoundsException
 * ------->StringIndexOutOfBoundsException
 * ---->InterruptedException
 * -->ClassNotFoundException
 * -->FileNotFoundException
 * -->IOException
 * -->SQLException(JDBC)
 * try
 * {
 * in which exception can be generated
 * }
 * catch(Exception e)
 * {
 * 
 * }
 * 
 * 
 * 
 * 1
 * 2
 * 3
 * 4
 * 5 : Invalid  : breaked --->Control --->JVM--->Default Exception Handler --
 * 6 
 * 7
 * 8
 * 9
 * 10
 *
 *
 *
 * Exception handling
 *
 * Exception : 
 * Is an abnormal condition / statement which disrupts the normal flow of program execution.
 * 
 * Collections
 * Multi threading
 * FileHandling
 * JDBC
 * StreamAPI
 * Junit and Maven
 * 
 *
 */

