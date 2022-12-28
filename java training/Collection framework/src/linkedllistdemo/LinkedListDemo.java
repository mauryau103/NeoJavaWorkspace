package linkedllistdemo;

import java.io.ObjectInputStream.GetField;
import java.util.LinkedList;

public class LinkedListDemo{
	public static void main(String[] args) {
		
		    
		        // Creating object of the
		        // class linked list
		        LinkedList<Double> ll = new LinkedList<>();
		 
		        // Adding elements to the linked list
		        ll.add(14000.97);
		        ll.add(13000.0);
		        ll.addLast(9000.79);
		        ll.addFirst(1300.67);
//		        ll.add(2, "E");
		 
		        System.out.println(ll);
		        
		        System.out.println(ll.get(1));
		        
		        ll.set(1,8000.2816);
		        System.out.println(ll);
		        
		        
		        System.out.println(ll.remove());
		        
		        System.out.println(ll.isEmpty());
		 
		        System.out.println(ll.contains(13000.0));
		        
		        System.out.println(ll.indexOf(13000.0));
//		        ll.remove("B");
//		        ll.remove(3);
//		        ll.removeFirst();
//		        ll.removeLast();
//		 
//		        System.out.println(ll);
		    }
		
	}
