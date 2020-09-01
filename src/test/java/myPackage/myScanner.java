package myPackage;
//import java.util.Scanner; // import only the Scanner class - only option to use scanner
import java.util. *; // import the entire package to use the scanner plus other classes

public class myScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter user name");
        String uName = myObj1.nextLine();
        System.out.println("user name is " + uName);
        
        
	}

}
