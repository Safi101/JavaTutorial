package myOuterInnerClass;

//import myOuterInnerClass.myOuterPrivateInner.InnerClass;

public class MainOuterPrivateInner1{
	  public static void main(String[] args) {
		  myOuterPrivateInner myOuter = new myOuterPrivateInner();
//		  myOuterPrivateInner.InnerClass myInner = myOuter.new InnerClass();// error because inner class is private in parent class
//	    System.out.println(myInner.y + myOuter.x);
		  
		  
		  
		  // calling inner static class without creating an object
		  myOuterStaticInner.myInner myInnerObj = new myOuterStaticInner.myInner();
		  System.out.println(myInnerObj.y);
		  
		  // accessing the outer class attribute/variable x by creating an object bc that is publlic
		  myOuterStaticInner myOuterObj = new myOuterStaticInner();
		  System.out.println(myOuterObj.x);
		  
	  	}

}
