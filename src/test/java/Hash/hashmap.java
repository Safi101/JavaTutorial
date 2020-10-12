package Hash;

import java.util.HashMap;

public class hashmap {
	public static void main(String[] args) {
		HashMap<String, String> capitalCities= new HashMap<String, String>();
		
		capitalCities.put("India" , "Dilli");
		capitalCities.put("England", "London");
		capitalCities.put("Bangladesh", "Dhaka");
		System.out.println(capitalCities);
		System.out.println("");
		System.out.println(capitalCities.get("England"));
		System.out.println(capitalCities.remove("England"));
		System.out.println(capitalCities.get("England"));
		capitalCities.clear();
		capitalCities.put("Bangladesh", "Dhaka");
		capitalCities.put("China", "Beijing");

		System.out.println(capitalCities);
		System.out.println(capitalCities.size());
		for (String i : capitalCities.keySet()) {
			System.out.println("key" + i);

			
		}
		
		for (String i : capitalCities.values()) {
			System.out.println("values" + i);

		}
		
		
		// key plus values
		for (String i : capitalCities.keySet()) {
			System.out.println(" key " + i + "values " + capitalCities.get(i) );

		}


          /// project student age
		HashMap<String, Integer> studentAge = new HashMap<String, Integer>();
		studentAge.put("sam", 1);
		studentAge.put("mike", 2);
		studentAge.put("john", 3);
		for ( String i : studentAge.keySet()) {
			System.out.println(i  + studentAge.get(i));
					
		}
		
		
		



	}
}
