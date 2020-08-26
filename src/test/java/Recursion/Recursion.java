package Recursion;

public class Recursion {

	public static void main(String[] args) {
	    int result = sum(1,4);
	    System.out.println(result);
	  }
	  public static int sum(int start, int end) {
	      System.out.println("==start " + start +  " end " + end);
	    if (end > start) {
	      System.out.println("start " + start +  " end " + end);
	      return end + sum(start, end - 1); 
	      // 4 + (sum(1,4-1))
	       // 4 + (3 + sum(1, 3-1))
	      // 4 + (3 + sum(1,2))
	      // 4 + (3 + 2 + sum(1,1)
	      // 4 + (3 + 2 + 1) = //10

	    } else {
		      System.out.println("--start " + start +  " end " + end);
	      return end;
	    }
	  }
	}