package dummy;

public class ThisKeyword {

	public static void main(String[] args) 
	{
		Dummy1 dummy1=new Dummy1(23);
		dummy1.show();
		// TODO Auto-generated method stub
	}
}
class Dummy1
{
	int num1=20;
	Dummy1()
	{
		System.out.println("Default constructor of Dummy1");
	}
	Dummy1(int a)
	{
		this();//call current class default constructor
		System.out.println("Parameterised constructor of Dummy1 : "+a);
		
	}
	void disp()
	{
		int num1=50;
		System.out.println(num1);
		System.out.println(this.num1);
	}
	void show()
	{
		this.disp();
	}
}