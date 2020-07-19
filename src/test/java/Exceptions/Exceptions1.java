package Exceptions;

public class Exceptions1 {
		public static void main(String args[]){
			try {
			int x=100;
			System.out.println("x" + x);

			}
			catch(Exception e) {
			System.out.println(e);
			}
			finally {
			System.out.println("finally block is executing");}
		
	
		
}
}