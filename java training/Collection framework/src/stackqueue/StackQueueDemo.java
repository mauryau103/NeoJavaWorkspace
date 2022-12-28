package stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueueDemo {
	public static void main(String[] args) {
		/*
		 * stack : LIFO Stack : class
		 * 
		 * queue: FIFO Queue : interface, LinkedList
		 * 
		 * deque : both side i/d Deque : interface , LinkedList
		 */

		List<Integer> myStack1 = new Stack<>();
		// upcasting : unique prperties of class are not visible

		Stack<Integer> myStack = new Stack<>();
		myStack.push(12);
		  myStack.push(12); 
		  myStack.push(13); 
		  myStack.push(112); 
		  myStack.push(123);
		 
		System.out.println(myStack);
		int popped = myStack.pop();
		System.out.println("popped:" + popped);
		System.out.println(myStack);
		popped = myStack.pop();
		System.out.println("popped:" + popped);
		System.out.println(myStack);
		int topele=myStack.peek();  // just gives top element
		System.out.println(topele);
		System.out.println(myStack);
		System.out.println(myStack.empty());
		
		// make a switch case 1: pop 2: push 3: display
		// use separate try catch in every case
		
		System.err.println("........QUEUE...........");
		
		Queue<Integer> myQueue=new LinkedList<>() ;
		  myQueue.add(120); 
		myQueue.add(12);
		  myQueue.add(12); 
		  myQueue.add(13); 
		  myQueue.add(112); 
		  myQueue.add(123);
		  myQueue.add(121); 
		System.out.println(myQueue);
		int removed=myQueue.remove(); // gives exception of queue is empty
		System.out.println("Removed: "+removed);
		System.out.println(myQueue);
	    removed=myQueue.remove();
		System.out.println("Removed: "+removed);
		System.out.println(myQueue);
		
		 myQueue.clear();
		 System.out.println(myQueue);
		//System.out.println(myQueue.element());  // throws exception if queue is empty
		System.out.println(myQueue);
		System.out.println(myQueue.peek()); // it returns null if queue is empty
		System.out.println(myQueue);

		//System.out.println(myQueue.remove()); //gives exception of queue is empty
		 System.out.println(myQueue.poll());  // returns null if queue is empty
		 System.err.println("..............DEQUE.........");
		 Deque<Integer> myDq=new LinkedList<>(); // or ArrayDeque
		 myDq.add(12);
		 myDq.add(12); 
		 myDq.add(13); 
		 myDq.add(112); 
		 myDq.add(123);
		 myDq.addLast(345);
		 myDq.addFirst(234);
		 System.out.println(myDq);
		 myDq.remove();
		 myDq.remove();
		 System.out.println(myDq);
		 myDq.removeFirst();
		 System.out.println(myDq);
		 myDq.removeLast();
		 System.out.println(myDq);
		 myDq.add(33);
		 myDq.add(33);
		 myDq.add(33);
		 System.out.println(myDq);
		 boolean b=myDq.removeFirstOccurrence(33);
		 System.out.println(b);
		 System.out.println(myDq);
	
		 Iterator<Integer> itr=myDq.iterator();
		 // while loop
	}
}