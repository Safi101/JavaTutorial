package constructor;

public class Car1 {
	
	int modelYear;
	String modelName;
	

	public Car1(int year, String model) {
		System.out.println("constructor");
		modelYear = year;
		modelName = model;
		
	}
	public static void main(String[] args) {
		System.out.println("main class");
		
		Car1 myCar1 = new Car1(1989, "Nissan sentra");
		System.out.println("created car object" + myCar1.modelName + " " + myCar1.modelYear);
		
		
		
	}
}
