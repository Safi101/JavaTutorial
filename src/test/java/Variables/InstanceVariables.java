package Variables;
import java.io.*;

public class InstanceVariables {
	   // this instance variable is visible for any child class.
	   public String name="jj";

	   // salary variable is visible in Employee class only.
	   private double salary=33.15;

	   // The name variable is assigned in the constructor.
	   //public InstanceVariables (String empName) {
	      //name = empName;
	   //}

	   // The salary variable is assigned a value.
	   public void setSalary(double empSal) {
	      salary = empSal;
	   }
	   
	   String collegeName(){
		   String college = "BBDIT";
		   return college;
		   }

	   // This method prints the employee details.
	   public void printEmp() {
	      System.out.println("name  : " + name );
	      System.out.println("salary :" + salary);
	   }

	   public static void main(String args[]) {
		   InstanceVariables empOne = new InstanceVariables();

//		   InstanceVariables empOne = new InstanceVariables("Ransika");
	      //empOne.setSalary(1000);
	      empOne.printEmp();
	      System.out.println("salary :" + empOne.salary);

	   }
	}

