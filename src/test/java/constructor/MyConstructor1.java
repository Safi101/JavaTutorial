package constructor;

public class MyConstructor1 {
	int x = 7;
	public MyConstructor1(int y) {
		System.out.println("MyConstructor1 - constructor 1");
		x = y;
	}
	
	public static void main(String[] args) {
		MyConstructor1 obj1 = new MyConstructor1(78);
		System.out.println("constructor1 main method " + obj1.x);
		
	}
}