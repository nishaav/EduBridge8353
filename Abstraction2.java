package dummy;

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerTable computerTable=new ComputerTable();
		computerTable.color();
		computerTable.price();
		computerTable.dimensions();
		computerTable.material();
	}
}
abstract class Furniture//100% abstraction
{
	abstract void material();
	abstract void dimensions();
	abstract void color();
	abstract void price();
}
class ComputerTable extends Furniture
{

	@Override
	void material() {
		// TODO Auto-generated method stub
		System.out.println("Wood");
	}

	@Override
	void dimensions() {
		// TODO Auto-generated method stub
		System.out.println(" 10ft * 2ft ");
	}

	@Override
	void color() {
		// TODO Auto-generated method stub
		System.out.println("Creamish texture");		
	}

	@Override
	void price() {
		// TODO Auto-generated method stub
		System.out.println("Rs. 12,000");		
	}	
}