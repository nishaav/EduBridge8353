package dummy;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile=new Mobile();
		mobile.setModelNo(7890);
		mobile.setBrand("Apple Inc.");
		mobile.setModelName("iPhone 13 Pro");
		mobile.setScreenSize(6.5f);
		mobile.setSpecification("Rear and front camera of high quality upgradable to all ios Versions");
		mobile.setPrice(75800);
		
		System.out.println(mobile.getBrand());
		System.out.println(mobile.getModelName());
		System.out.println(mobile.getModelNo());
		System.out.println(mobile.getPrice());
		System.out.println(mobile.getScreenSize());
		System.out.println(mobile.getSpecification());
	}

}

class Mobile
{
	private int modelNo;
	private int price;
	private String modelName;
	private String brand;
	private String specification;
	private float screenSize;
	
	public float getScreenSize()
	{
		return screenSize;
	}
	public void setScreenSize(float screenSize)
	{
		this.screenSize=screenSize;
	}
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSpecification() {
		return specification;
	}
	public void setSpecification(String specification) {
		this.specification = specification;
	}

	
}



/*
 * early binding and late binding 
 * early  binding : type of object determined at compile time : method overloading
 * late binding : type of object determined at runtime : method overriding / upcasted
 *  
 *  static binding 
 *  dynamic binding 
 *
 *Encapsulation is binding of data members(methods(behavior) and variable(state)) into a single unit.
 *
 * Encapsulated Class
 * 1) member variables must be private
 * 2) setter and getter methods must be public
   3) class must have the default constructor	 
 * setter: initialize    
 * getter : fetch the associated value
 */