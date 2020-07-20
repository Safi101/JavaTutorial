package DataTypesCasting;

public class AllDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //		Data types are divided into two groups:
        // There are eight primitive data types in Java:


        //			Primitive data types - includes byte, short, int, long, float, double, boolean and char
        //			Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)

		
	// byte
//		Byte
//		The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other 
		// integer types to save 
//		memory when you are certain that the value will be within -128 and 127:
		
		// here keeping the value between -128 and 127
		System.out.println("1 byte");
		byte byteDataType;
		byteDataType = 127; // if value is outside the range, error "cannot convert from int to byte"
		System.out.println("byteDataType" + byteDataType);
		
		// here keeping the value more than 127
		// error "cannot convert from int to byte"
//		System.out.println("1 byte");
//		byte byteDataTypeBad;
//		//byteDataTypeBad = 129;//cannot convert from int to byte
//		System.out.println("byteDataTypeBad" + byteDataTypeBad);
		
//		Short
//		The short data type can store whole numbers from -32768 to 32767:
		System.out.println("2 short");
		short shortDataType;
		shortDataType = 32767; // if value is outside the range, error "cannot convert from int to short"
		System.out.println("shortDataType" + shortDataType);
		
		
//		Int
//		The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
		System.out.println("3 int");
		int intDataType;
		intDataType = 2147483647; // if value is outside the range, error "The literal 666 of type int is out of range "
		System.out.println("intDataType" + intDataType);
		
//		Long
//		The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value.
		//Note that you should end the value with an "L":
		System.out.println("4 Long");
		long longDataType;
		longDataType = 9223372036854775807L; // if value is outside the range, error "The literal 666 of type int is out of range "
		System.out.println("longDataType" + longDataType);
		
		
//		Floating Point Types
//		You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
//		Float
//		The float data type can store fractional numbers from 3.4e−038 to 3.4e+038. 
		// Note that you should end the value with an "f":
//			
		System.out.println("5 float");
		float myfloat;
		myfloat = 4.44f;// if value is outside the range, error "Type mismatch: cannot convert from double to float"
		System.out.println("myfloat" + myfloat);
		
//		Double
//		The double data type can store fractional numbers from 1.7e−308 to 1.7e+308. Note that you should end the value with a "d":
		System.out.println("6 double");
		double myDouble;
		myDouble = 4.4888888888888887777777777777777777777778884;// if value is outside the range, error ??
		System.out.println("myDouble" + myDouble);
		
//		Booleans
//		A boolean data type is declared with the boolean keyword and can only take the values true or false:
		System.out.println("7 boolean");
		boolean myBoolean = true;
		System.out.println(myBoolean);
		
//		Characters
//		The char data type is used to store a single character. The character must be surrounded by single quotes, like 'A' or 'c':
//		
		System.out.println("8 char");
		char myChar = 'A';
		System.out.println(myChar);
		
		
//		Strings
//		The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes:
        System.out.println("9 string");	
        String myString = "john";
        System.out.println(myString);
        
//        Non primitive data types are strings, arrays, classes, interfaces
	}

}
