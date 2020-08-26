package ifElse;

public class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1 if");
		int x =6;
		int y =4;
		if (x>y) {
			System.out.println("x>y");
		}
		
		
		System.out.println("2 else");
		
		if (x>y) {
			System.out.println("x>y");

		}
		else {
			System.out.println("x<y");
			}
		
		
		System.out.println("3 else if");
		if (x>y) {
			System.out.println("x>y");

		}
		else if(x<y) {
			System.out.println("x<y");

		}
		else {
			System.out.println("x=y");

		}
		
		System.out.println("4 Short Hand If...Else (Ternary Operator");
        // if x > y, else
		//we can write this way variable = (condition) ? expressionTrue :  expressionFalse;
        
		String tOPER = (x>y) ? "EQUAL" : "NOT EQUAL";
		System.out.println(tOPER);
		}

			
	}


