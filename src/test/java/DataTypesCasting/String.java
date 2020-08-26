package DataTypesCasting;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1 String Length");
	    java.lang.String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		
		System.out.println("2 UPPER CASE");
	    java.lang.String txt1 = "ABCDEFGHIJKLMsfddsfNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.toUpperCase());
		
		System.out.println("3 LOWER CASE");
	    java.lang.String txt2 = "ABCDEFGHIJaaaKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.toLowerCase());
		
		System.out.println("4 Finding a Character in a String");
	    java.lang.String txt3 = "ABCDEFGHIJaaaKLMNOPQRSTUVWXYZ";
		System.out.println("Finding a Character in a String: " + txt.indexOf("F"));
		
		System.out.println("5 Concatenation");
	    java.lang.String contS1 = "MO";
	    java.lang.String contS2 = "SAFI";
		System.out.println(contS1 + contS2);
		System.out.println(contS1.concat(contS2));
		
		
		System.out.println("6 Special characters");
	    java.lang.String specCharDoubbleQ = "testing double quotes in string We are the so-called \"Vikings\" from the north.";
	    java.lang.String specCharSingleQ = "single quotes \'S alright.";
	    java.lang.String newLine = "first line \n second line.";
	    java.lang.String tab = "first line\t second line.";
		System.out.println(specCharDoubbleQ);
		System.out.println(specCharSingleQ);
		System.out.println(newLine);
		System.out.println(tab);
		
		System.out.println("7 adding numbers strings");
	    java.lang.String contS11 = "10";
	    java.lang.String contS21 = "20";
		System.out.println("string plus string" + contS11 + contS21);
		
	    int int1 = 20;
		System.out.println("string plus int" + contS11 + int1);
		
		System.out.println("string plus string plus int" + contS11 + contS21 + int1);
		System.out.println(int1 + int1 + contS11);//"int plus int plus string" + 


		



		
	}
	}


