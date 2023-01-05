package dummy;

public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//anonymous class
			Electronics electronics=new Electronics() 
			{
				@Override
				void quality() {
					// TODO Auto-generated method stub
					System.out.println("Providing definition to quality method of class Electronics");
				}
				
			};
			electronics.quality();
			electronics.show();
			
			
			Calc calc=new Calc()
					{
						@Override
						public void add() {
							// TODO Auto-generated method stub
							System.out.println("Addition logic needs to be implemented");
						}
					};
					
					calc.add();
	}

}
/*
 * Anonymous class : is a inner class without name and for which only one object is created 
 * Using anonymous class concept, we can override or define the methods of abstract classes and interfaces
 * Anonymous class creation is just like an invocation to the class constructor followed by a block of code
 *
 */
abstract class Electronics//100% abstraction
{
	abstract void quality();
	void show()
	{
		System.out.println("calling show");
	}
}

interface Calc
{
	void add();
}