package dummy;

public class Super2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
		child.display();
	}
}
class Parent
{
	int num1=10;
	Parent()
	{
		super();
	}
	
	void show()
	{
		System.out.println("Parent class method");
	}
}
class Child extends Parent
{
	int num1=20;

	void show()
	{
		int num1=30;
		System.out.println("Parent class variable : "+super.num1);
		System.out.println("Class variable : "+this.num1);
		System.out.println("Local variable : "+num1);
	}
	void display()
	{
		super.show();
	}
}
