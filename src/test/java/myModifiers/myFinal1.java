package myModifiers;

public class myFinal1 {
	final String schoolName = "NJIT";
	final int schoolBuiltYear = 1878;
	public static void main(String[] args) {
		System.out.println("main static");
		myFinal1 student1 = new myFinal1();
		//student1.schoolName = "fff"; // final value cant be assigned
		System.out.println("main static" + student1.schoolName);

		
	}
}
