package Math;

public class math {

	public static void main(String[] args) {
		
		System.out.println("---1 Max");
	   math m = new math();// created an object to access the NonStaticMethodMax
	   int x = m.NonStaticMethodMax(3, 5); // did not create an object to access static method
       System.out.println("NonStaticMethodMax " + x);
       System.out.println("StaticMethodMax" + StaticMethodMax(5,6));
       
	   System.out.println("---2 Min");
	   System.out.println("static min" + math.StaticMethodMin(7, 9));
	   
	   System.out.println("---3 sqrt");
	   System.out.println("static sqrt" + math.staticMSqrt(69));
	   
	   System.out.println("---4 abs");
	   System.out.println("static abs" + math.staticABS(-4.4));
	   
	   System.out.println("---5 random default range -  0.0 (inclusive), and 1.0 (exclusive):");
	   System.out.println("static random default" + math.staticRandom());
	   System.out.println("static random default times number" + math.staticRandom() * 101);
      
 	}
	
    public int NonStaticMethodMax(int x, int y) {
  	   System.out.println(Math.max(x,y));
  	   return Math.max(x, y);
     }
    
    public static int StaticMethodMax(int x, int y) {
    	System.out.println(Math.max(x, y));
    	return Math.max(x, y);
    	
    }
    
	public static int StaticMethodMin(int x, int y) {
		return Math.min(x,y);
	}
	
	public static double staticMSqrt(double x) {
		return Math.sqrt(x);
	}
	
	public static double staticABS(double x) {
		return Math.abs(x);
	}
	
	public static double staticRandom() {
		return Math.random();
	}


}
