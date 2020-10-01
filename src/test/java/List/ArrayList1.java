package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("BMW");
		cars.add("lexus");
		cars.add("nissan");
		cars.add("ford");
		System.out.println(cars);
		System.out.println(cars.get(0));
		cars.set(0, "new car");
		System.out.println(cars.get(0) + cars.size());
		cars.remove(0);
		System.out.println(cars.get(0) + cars.size());
		Collections.sort(cars);
		for (int i = 0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		
		ArrayList<Integer> studentId = new ArrayList<Integer>();
		studentId.add(4);
		studentId.add(1);
		studentId.add(9);
		studentId.add(3);
		Collections.sort(studentId);
		System.out.println(studentId);		

		
	}

}
