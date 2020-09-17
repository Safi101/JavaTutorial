//Difference between Enums and Classes
//An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
//
//An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).
//
//Why And When To Use Enums?
//Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
package my_enum;

public class enum1 {
	
	enum levels {
		LOW, 
		MED, 
		HIGH
	}
	
	public static void main(String[] args) {
		levels myLevel = levels.LOW;
		System.out.println(myLevel);
		
		for (levels myLeve : levels.values()) {
			System.out.println(myLeve);
			
		}
	}

}
