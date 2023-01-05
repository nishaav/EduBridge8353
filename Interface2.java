package dummy;

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface Ring1
{
	int tenure=4;
	void show();
}
interface Ring2
{
	int roi=5;//by default the variables are final in an interface therefore we cannot reinitialize them
	void display();
}
class SampleApp
{
	void function()
	{
		System.out.println("Method of SampleApp class");
	}
}
class Hp extends SampleApp implements Ring1,Ring2 //multiple inheritance using interfaces : multiple interface implementation
{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method of interface RIng2");
		System.out.println(roi);
		System.out.println(tenure);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method of interface RIng1");
		
	}
	
}
//interface can extend interface
//class can extend class
//class can implement interfaces