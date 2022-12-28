package listdemos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
/*List: indexed, duplicate allowed, multiple null allowed, ordered: insertion order followed
 *Vector : legacy class (generally not used), Stack: legacy LIFO
 *ArrayList : nonlegacy (most popular) : dynamic array, : contiguous memory allocation
 *LinkedList : non legacy (most popular): doubly linked list*/
	
	
	public static void main(String[] args) {
		List myList1=new ArrayList();
		myList1.add(234);
		myList1.add(234);
		myList1.add("dsad");
		myList1.add(45.67);
		System.out.println(myList1);
		//List<Integer> myList2=new ArrayList<>();  // used
		List<Integer> myList2=new ArrayList<Integer>();
		myList2.add(1);
		myList2.add(234);
		myList2.add(123);
		myList2.add(2);
		myList2.add(434);
		myList2.add(123);  // duplicate allowed
		myList2.add(234);
		myList2.add(523);
		System.out.println(myList2);  
		System.out.println(myList2.get(1));  // indexed collection
		myList2.set(2, 5555);
		System.out.println(myList2); 
		myList2.remove(1); // only index works for integer collection
		System.out.println(myList2); 
		List<String> myList3=new ArrayList<String>();
		myList3.add("Hari");
		myList3.add("Krupa");
		myList3.add("Hari");
		myList3.add("Komal");
		myList3.add("Ritesh");
		myList3.add("Reedip");
		System.out.println(myList3);
		System.out.println(myList3.get(1));
		myList3.set(3, "Karuna");
		System.out.println(myList3); 
		myList3.remove(1);
		System.out.println(myList3); 
		myList3.remove("Hari");
		System.out.println(myList3); 
		System.out.println(myList3.isEmpty());
	//	myList3.clear();
		System.out.println(myList3.size());
		System.out.println(myList3.contains("Ritesh"));
		System.out.println(myList3.indexOf("Karuna"));
		System.out.println(myList3); 
		
		/*Implement Linked List of collection of salaries (Double)*/
		/*add, get, set , remove,isEmpty, contains, indexOf, size*/
	}
}