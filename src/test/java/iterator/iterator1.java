package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator1 {
	
	public static void main(String[] args) {
		ArrayList<String> iterate = new ArrayList<String>();
		iterate.add("lexus");
		iterate.add("bmw");
		iterate.add("nissan");

		
		Iterator<String> i = iterate.iterator();
		System.out.println(i.hasNext() + "   value   " + i.next());
		
		while(i.hasNext()) {
			Object element = i.next();
			System.out.println("element " + element);
		}
		
		
		 ArrayList<Integer> numbers = new ArrayList<Integer>();
		    numbers.add(12);
		    numbers.add(8);
		    numbers.add(2);
		    numbers.add(23);
		    Iterator<Integer> it = numbers.iterator();
		    while(it.hasNext()) {
		      Integer mi = it.next();
		      if(mi < 10) {
		        it.remove();
		      }
		    }
		    System.out.println(numbers);
		    
		    
		    
		    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		    myNumbers.add(2);

		    myNumbers.add(7);
		    myNumbers.add(2);
		    myNumbers.add(8);

		    
		    Iterator<Integer> myIter = myNumbers.iterator();
		    while(myIter.hasNext()) {
		    	Integer myV = myIter.next();
		    	if (myV == 7){
		    	myIter.remove();	
		    		
		    	}
		    }
		    
//		    System.out.println("myIter" + myIter);
		    System.out.println("myNumbers" + myNumbers);

			
			
			
			
		}
		
		
		
	}


