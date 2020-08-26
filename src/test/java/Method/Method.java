package Method;

public class Method {

	public static void main(String[] args) {
       TestMethod();
       methodParam("ff", "dd");
       int returnedV = methodReturn(4);
       System.out.println("returned value" +returnedV );
	}
	
	static void TestMethod() {
		System.out.println("my method was called");
	}
	
	static void methodParam(String x, String y) {
		System.out.println("x " + x + " y " + y);
	}
	
	static int methodReturn(int x) {
		return x;
	}

}
