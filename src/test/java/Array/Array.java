package Array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaration 
		System.out.println("1 declaration");
		String[] cars = {"nissan", "lexus", "toyota"};
		int[] studentID = {1,2,4,5};
		
		for (String c : cars) {
			System.out.println(c + cars[2]);
		}
		
		// changing array element
		cars[2] =  "honda";
		System.out.println(cars[2]);
		for (String c : cars) {
			System.out.println(c + cars[2]);
		}
		
		// length
		System.out.println("length" + cars.length);
		
		// loop thru 
		for(int i=0; i<cars.length; i++) {
			System.out.println("cars " + i + cars[i]);
		}
		
		// multi dimensional array
		int[][] myNums = { {1,2,3,4,5}, {7,8,9,10,11}};
		int x = myNums[1][2]; //two indexes here. first index is to specify which array and second index is which element no on that array. 
		int y = myNums[1][0];
		System.out.println("X " + x + "y" + y);
		
		// inner for
		System.out.println("inner loop");
		System.out.println("length of multi dimen array" + myNums.length);
	    for (int i = 0; i < myNums.length; i++) {
			 for(int j =0; j < myNums[i].length; j++)
	          System.out.println(myNums[i][j]);		
			 }
	     }

}
