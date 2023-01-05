package dummy;

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Demo()//obj
		//Demo demo
		Key key=new Key();
		key.show();
	
	}

}
interface Demo
{
	int i=10;
	static int j=10;
	
	void show();
	//interfaces do not have constructor
	//interfaces by default have final variable
	//interfaces can have static variables
	//by default the methods in interfaces are public abstract
	//implements keyword
}
class Key implements Demo
{
	public void show()
	{
		System.out.println("Providing definition to interface method show()");
	}
}