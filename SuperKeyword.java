package dummy;

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b1=new B1();
	}

}
class A1
{
	A1(int a)//no-argument constructor
	{
		System.out.println("In class A1");
	}
}
class B1 extends A1
{
	B1()
	{
		//super();
		super(4);
		System.out.println("In class B1");
	}	
}
