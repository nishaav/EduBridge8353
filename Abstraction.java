package dummy;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car creta=new Creta();
		creta.mileage();
		creta.interior();
		creta.price();
		
		//Car car=new Car();
		//Why we cannot instantiate the abstract class ?
		//abstract class can have abstract as well as non-abstract methods
		//abstract classes do have constructor
	}
}
abstract class Car
{
	abstract void mileage();//method declaration
	abstract void interior();
	void price()
	{
		System.out.println("10L");
	}

}
class Creta extends Car
{
	@Override
	void interior() {
		// TODO Auto-generated method stub
		System.out.println("Interior method as defined");
	}

	@Override
	void mileage() {
		// TODO Auto-generated method stub
		System.out.println("Mileage method as defined");
	}
	
}
/*
 * Abstraction : the process of hiding the implementation details and communicating the necessary functionality for the
 * end user
 * ->abstraction is a process of identifying the required characteristics which the object must carry and ignoring the 
 * unnecessary or irrelevant details
 * 1) abstract classes
 * -> by creating abstract and non-abstract methods
 * abstract methods : -> which are required to be defined 
 *  				  -> which do not have a body
 * non-abstract methods : which are having a default definition
 * 0-100% abstraction non-abstract as well as abstract methods
 * 2) interfaces
 * 
 * 
 * Laptop : 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */