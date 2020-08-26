package Method;

public class MyMethod2 {
	public static void main(String[] args) {
		System.out.println("method 2 main");
		MyMethod1.addnum();
		
		// calling public method in MyMethod1
		MyMethod1 obj1 = new MyMethod1();
		obj1.pubMethod();
	}
}
