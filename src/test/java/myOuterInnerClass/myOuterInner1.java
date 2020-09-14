package myOuterInnerClass;

public class myOuterInner1 {
	int myOuterVariable = 7;
	
	public class myInner1 {
		
		int myInnerVariable = 6;
		
		public int myInnerMethod() {
			int x = 0;
			return x;
		}
		
	}
	
	

	public static void main (String[] args) {
		
		myOuterInner1 myouter1 = new myOuterInner1();
		myOuterInner1.myInner1 myInnerClass1 = myouter1.new myInner1();
		System.out.println(myInnerClass1.myInnerVariable);
		System.out.println(myouter1.myOuterVariable);
		myOuterInner1.myInner1 myInnerObj = myouter1.new myInner1();
		System.out.println(myInnerObj.myInnerVariable);	
		System.out.println(myInnerObj.myInnerMethod());		
		
	}
}
