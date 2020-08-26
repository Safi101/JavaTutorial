package classes;

public class MyClass2 {
public static void main(String[] args) {
	MyClass1 obj1 = new MyClass1();{
		
	// accessing attribute from parent public class	
	System.out.println("creating myclass1 object" + obj1.x);
	
	// override attribute from parent class
	obj1.x = 77;
	System.out.println("override attribute" +  obj1.x);
	
	
	// prevent override
//	obj1.y = 8; // gives an error that final Myclass1.y cant be assigned
	
	}
}
}
