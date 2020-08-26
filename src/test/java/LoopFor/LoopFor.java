package LoopFor;

public class LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---1 For Loop");
		for(int x=0; x<4; x++) {
			System.out.println("x" + x);
		}
		
		System.out.println("---2 For-Each Loop");
//		for (type variableName : arrayName) {
//			  // code block to be executed
//			}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i);
		}
		
		String[] students = {"John", "Mike", "Sam"};
		for (String s : students) {
			System.out.println(s);
			break;
			
		}
		

	}

}
