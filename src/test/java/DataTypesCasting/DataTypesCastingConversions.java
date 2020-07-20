package DataTypesCasting;

public class DataTypesCastingConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1 Double to Int - manual converion  because double is larger");
		double myDouble = 4.44d;
		System.out.println(myDouble);
//		int myInt = (int).myDouble;//get this error because of dot(.) Syntax error on token "int", invalid Expression
		int myInt = (int) myDouble;
		System.out.println(myInt);
		
		System.out.println("2 int to double - auto conversion from int to double because int is smaller");
		int myInt1 = 9;
		double myDouble1 = myInt1;
		System.out.println("myDouble1" + myDouble1);	
		
		

	}

}
