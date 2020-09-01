package Inheritanc;

public class car1 extends vehicle1{

	private String myCar1 = "model 1";

	public static void main(String[] args) {
		
		car1 car1 = new car1();
		System.out.println("car1 " + car1.brand + car1.myCar1);
		
		
		//trying to use method or attributes from final super class but will throw an error
		car1 myCar2 = new car1();
		System.out.println("trying to access attribute from final call myFinalVehicle");
		System.out.println(car1.brand);
		
		
	}
	

}
