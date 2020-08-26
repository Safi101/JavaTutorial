package MethodOverload;

public class MethodOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	plusnumbers(1,2);
	plusnumbers(3.3,4.4);

	}
	
	static int plusnumbers(int x, int y) {
		System.out.println(x + y);
		return x + y;
	}
	
	static double plusnumbers(double  x, double y) {
		System.out.println(x + " double " + y);
		return x + y;
	}

}
