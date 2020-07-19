package Variables;

public class VariablesDeclerations {

//	Variables are containers for storing data values.
//
//	In Java, there are different types of variables, for example:
//
//	String - stores text, such as "Hello". String values are surrounded by double quotes
//	int - stores integers (whole numbers), without decimals, such as 123 or -123
//	float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//	char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//	boolean - stores values with two states: true or false
	
	public static void main(String[] args) {
		
		// string variable
		String studentName = "John";
		System.out.println("student name is " + studentName);
		
		// int variable
		int rollNo = 9;
		rollNo = 19;

		System.out.println("roll no " + rollNo);
		
		// final
		final int rollNoo = 7;
		//		rollNoo = 9; // not allowed because final variable
//		Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			The final local variable rollNoo cannot be assigned. It must be blank and not using a compound assignment
//
//			at Variables.VariablesDeclerations.main(VariablesDeclerations.java:29)

		System.out.println(" roll no " + rollNoo);
		
		
	}
	

}
