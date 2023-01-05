package dummy;

public class NestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static class
		Wall.Paper.display();
		Wall.Paper paper=new Wall.Paper();
		paper.show();

		//member class
		Computer computer=new Computer();
		Computer.Table table=computer.new Table();
		table.shop();
	
		//local class
		Local local=new Local();
		local.show();
	}

}
//static class
class Wall
{
	static class Paper
	{
		void show()
		{
			System.out.println("Show method of class Paper");
		}
		static void display()
		{
			System.out.println("Display method of class Paper");
		}
	}
}
class Computer
{
	private int j=10;
	class Table
	{
		void shop()
		{
			System.out.println("Calling shop for computertable "+j);
		}
	}
}
class Local
{
	void show()
	{
		int num1=10;
		class Dummy//local
		{
			void display()
			{
				System.out.println("Method of Local class");
			}
		}
		Dummy dummy=new Dummy();
		dummy.display();
	}
}
/*
 * Type of variables : 
 * 
 * static
 * non-static : instance
 * local variable
 * 
 * Nested classes :
 * class inside another class.
 * Static class
 * ->inner class with static features
 * Non-static class : inner class
 * ->member inner class
 * ->local inner class
 * ->anonymous class
 * 
 */