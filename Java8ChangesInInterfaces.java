package dummy;

public class Java8ChangesInInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape.display();
		Circular circular=new Circular();
		circular.area();
		circular.volumn();
		Circular.display();
	}

}
// From Java 8
// interface can have abstract as well as non-abstract methods using default keyword

interface Shape
{
	void area();
	public default void volumn()
	{
		System.out.println("defining volumn method in Shape interface");
	}
	public static void display()
	{
		System.out.println("display static method of interface Shape");
	}
}

class Circular implements Shape
{
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Defining Area method of Shape interface");
	}
	
	@Override
	public void volumn()
	{
		System.out.println("redefining method volumn");
	}
	
	public static void display()
	{
		System.out.println("redefining method display");
	}
}
