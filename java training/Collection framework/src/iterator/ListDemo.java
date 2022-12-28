package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
		myList3.add(2,"Vina");
		System.out.println(myList3); 
		
		/*Implement Linked List of collection of salaries (Double)*/
		/*add, get, set , remove,isEmpty, contains, indexOf, size*/
		
		// normal for
		for(int i=0;i<myList3.size();i++) {
			String name=myList3.get(i);
			System.out.println(name);
		}
		// enhanced for
	for(String name:myList3){
		System.out.println(name);
	}
		//iterator
		System.out.println("----using Iterator--------");
		Iterator<Integer> itr=myList2.iterator();
	     while(itr.hasNext()) {
	    	 		Integer ele=itr.next();
	    	 		System.out.println(ele);
	     }
	     itr=myList2.iterator();
	     while(itr.hasNext()) {
 	 		Integer ele=itr.next();
 	 		System.out.println(ele);
 	 		//myList2.remove(5); // do not modify collection via list object in traversing phase
	     }
	Iterator<String> itr2=myList3.iterator();    
	     while(itr2.hasNext()) {
	    	 String ele=itr2.next();
	    	 System.out.println(ele);
	     }
	     /*Iterator can not be used to come backward*/
	     /*Iterator can not be access index of traversed element*/
	     
	     // remove 123 from list in traversing phase
	     System.out.println(myList2);
	     itr=myList2.iterator();     
	     while(itr.hasNext()) {
 	 		Integer ele=itr.next();
 	 		if(ele==123)
 	 			itr.remove();
	     }
	     // display list to test removal
	     System.out.println(myList2);
	     
	     for(int i=0;i<myList2.size();i++){
	    	 int e=myList2.get(i);
	 		if(e==5555)
	 			myList2.remove(i);
	 	}
	     System.out.println(myList2);
	    
		//ListIterator  : sub interface Iterator
	     /*only works for lists : Vector, Stack, ArrayList, LinkedList*/
	     /*1. can traverse backward
	      * 2. we can access index while traversing
	      * 3. updation : add, set, remove*/
	     
	     ListIterator<Integer> listitr=myList2.listIterator();
	     System.out.println("Forward Traversing");
	     while(listitr.hasNext()) {
	    	 int index=listitr.nextIndex();
	    	 Integer ele=listitr.next();
	    	 System.out.println(ele+"   =>>  "+index);
	     }
	     System.out.println("Backward Traversing");
	     while(listitr.hasPrevious()) {
	    	 int index=listitr.previousIndex();
	    	 Integer ele=listitr.previous();
	    	 System.out.println(ele+"   =>>  "+index);
	     }
	     listitr=myList2.listIterator();
	     System.out.println("Forward Traversing");
	     while(listitr.hasNext()) {
	    	 int index=listitr.nextIndex();
	    	 if(index==3)
	    		 	listitr.add(8888);
	    	 
//	    	 if(index==1)
//	    		 listitr.set(7676);
	    	 listitr.next();
	     }
	     System.out.println(myList2);
	     //setting new element at index 1
	     listitr=myList2.listIterator();
	     System.out.println("Forward Traversing");
	     while(listitr.hasNext()) {
	    	 int index=listitr.nextIndex();
	    	 System.out.println(index);
	    	 if(index==2)
	    		 listitr.set(7676); // set to current
	    	 myList2.set(0, 8989); // allowed
	    	 listitr.next();
	     }
	     System.out.println(myList2);
	}
	
}
