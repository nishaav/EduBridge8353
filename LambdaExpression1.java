package dummy;

public class LambdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//option 1
			Addition addition=(int a,int b)->{
				return a+b;
			};
			//option 2
			Subtraction subtract=(int a,int b)->a-b;
			EvenOdd evenOdd=(num1)->{
				if(num1%2==0)
				{
					return true;
				}
				else
				{
					return false;
				}
			};
			//} will mark the end of method definition
		//; is used at last to mark the end of the lambda expression.
			System.out.println(addition.add(12, 24));
			System.out.println(subtract.subtract(45, 23));
			System.out.println(evenOdd.isEven(45));

			
			Highest highest=(int num1,int num2,int num3)->{
				
				if(num1>num2 && num1>num3)
				{
					return num1;
				}
				else if(num2>num3)
				{
					return num2;
				}
				else
				{
					return num3;
				}
			};
			
	}
}
@FunctionalInterface
interface Highest
{
	int getHighest(int num1,int num2,int num3); 
}


@FunctionalInterface
interface Addition
{
	int add(int a,int b);
}
@FunctionalInterface
interface Subtraction
{
	int subtract(int a,int b);
}
@FunctionalInterface
interface EvenOdd
{
	boolean isEven(int num1);
}
/*Benefit of using Lambda : 
 *  1)As compiler treats the expression as a function, so no .class files will be generated for it.
 *  2)Occupies least amount of memory
 *  3)least amount of code
 * 
 *
 */


