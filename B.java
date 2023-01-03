package dummy;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.name="Priya";
		a.show();	
		a.age=13;//protected member accessible outside the class in same package
	}
}
