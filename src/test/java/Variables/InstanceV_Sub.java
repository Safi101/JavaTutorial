package Variables;

public class InstanceV_Sub extends InstanceVariables{

	// InstanceVariable super class has instance variable
	// here creating an instance of the class(object)
	// object should see the inst. variable
	public static void main(String[] args){
		InstanceVariables InsV = new InstanceVariables();
		System.out.println(InsV.name );
		//String colName = InstanceVariables.collegeName();
		//System.out.println(colName +"static");


	}

}
