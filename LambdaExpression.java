package dummy;

public class LambdaExpression {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//defining the lambda Expression
		App app=()->
		{			
			System.out.println("Defining method with Lambda Expression Architecture");
		};
		//calling
		app.show();
		/*
		 * Lambda expression :
		 * is a way to provide definition to abstract method an interface
		 * functional 
		 * ->compiler : treats the lambda expression as a function so it does not create the .class file and not occupies
		 * the class memory
		 * 
		 * source code(.java)----->javac(byte code)(.class)(every class in java)
		 * 
		 * 1)parenthesis : () : specify the list of argument
		 * 2)arrow operator : 
		 * 3)method body
		 */

		int a=10,b=-20,c=5;
		int result=(a++)+(++b);
		
	}
}
@FunctionalInterface
interface App
{
	void show();
}

/*
 * Functional Interface : 
 * SAM(Single Abstract Method Interfaces)
 * ->are those interfaces which holds only 1 abstract method 
 *
 *
 *
 */
