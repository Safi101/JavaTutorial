package myModifiers;

public class myStaticMethod1 {

	static void myStaticM1() {
		System.out.println("static method can be called wo creating an object");
	}
	
	public void myPublicM1() {
		System.out.println("public method can be called by creating an object");
	}
	
	
	public static void main(String[] args) {
		
		// calling static method without creating an object
		myStaticMethod1.myStaticM1();
		
		// calling public method by creating an object
		myStaticMethod1 myPublicM1 = new myStaticMethod1();
		myPublicM1.myPublicM1();
		
		
	}
}
