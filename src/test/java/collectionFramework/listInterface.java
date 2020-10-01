package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listInterface {
	
	public static void main(String[] args) {
	
	List arrayList = new ArrayList();
	arrayList.add("NYC");
	arrayList.add("VA");
	arrayList.add("NJ");
	System.out.println(arrayList);
	System.out.println(arrayList.get(2));

	
	List linkedList = new LinkedList();
	linkedList.add("NYC");
	linkedList.add("VS");
	System.out.println(linkedList);
	System.out.println(linkedList.get(1));
	
	ListIterator<String> listIter = arrayList.listIterator();
	while(listIter.hasNext()) {
		System.out.println("item " +listIter.next());
	}
	
	while(listIter.hasPrevious()) {
		System.out.print("item " + listIter.previous());
	}
	


	}
	
	

}
