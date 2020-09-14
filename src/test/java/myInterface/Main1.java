package myInterface;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       pig1 myPig = new pig1();
       myPig.animalSound();
       myPig.run();
       
      // Interface attributes are by default public, static and final
       // i created a variable x in interface. which should be final by default. lets try to override
//       myPig.x = 9; // this will give me an error because x is a default final value in interface. 
       
       // we can only print it here. 
//       AnimalInterface1.x
       
       
       // i have multiinterface. creating object to access both interfaces
       multInterfaceSubClass obj1 = new multInterfaceSubClass();
       obj1.animalSound();
       obj1.animalSound2();
       obj1.run();
       obj1.run2();
	}

}
