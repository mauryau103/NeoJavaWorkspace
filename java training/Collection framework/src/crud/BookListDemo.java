package crud;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import comparatordemo.CompareOnId;
import comparatordemo.CompareOnName;
import comparatordemo.CompareOnPrice;

public class BookListDemo {
public static void main(String[] args) {
	/*
	 * Collections : class 
	 * Collection : interface
	 * 
	 * 
	 */
	List<Integer> numList=new LinkedList<>();
	numList.add(34);
	numList.add(14);
	numList.add(345);
	numList.add(324);
	numList.add(14);
	System.out.println(numList);
	Collections.sort(numList); // mutable
	System.out.println(numList);
	
	List<String> nameList=new LinkedList<>();
	nameList.add("Pawan");
	nameList.add("Kumar");
	nameList.add("Amar");
	nameList.add("amar");
	nameList.add("Amrapali");
	nameList.add("Pooja");
	System.out.println(nameList);
	Collections.sort(nameList); // merge sort
	System.out.println(nameList);
	
	List<Book> bkList=new LinkedList<>();
	bkList.add(new Book(2,"Java",600));
	bkList.add(new Book(1,"PHP",300));
	bkList.add(new Book(12,"CPP",400));
	bkList.add(new Book(10,"Core Java",600));
	bkList.add(new Book(13,"Java Basics",700));
	bkList.add(new Book(15," Learn Python",650));
	bkList.add(new Book(14,"Web Basics",550));
	for(Book bk:bkList)
			System.out.println(bk);
//	Collections.sort(bkList); // to sort custom object. We have to make them comparable (able to compare)
	for(Book bk:bkList)
		System.out.println(bk);
	
	System.out.println("------------------------------------------");
	List<Book> bkList2=new LinkedList<>();
	bkList2.add(new Book(2,"Java",600));
	bkList2.add(new Book(1,"PHP",300));
	bkList2.add(new Book(12,"CPP",400));
	bkList2.add(new Book(10,"Core Java",600));
	bkList2.add(new Book(13,"Java Basics",700));
	bkList2.add(new Book(15,"Learn Python",650));
	bkList2.add(new Book(14,"Web Basics",550));
	for(Book bk:bkList2)
			System.out.println(bk);
	System.out.println("Sort on Id");
	Collections.sort(bkList2,new CompareOnId()); // to sort custom object. We have to make them comparable (able to compare)
	for(Book bk:bkList2)
		System.out.println(bk);
	
	System.out.println("Sort on price");
	Collections.sort(bkList2,new CompareOnPrice());
	for(Book bk:bkList2)
		System.out.println(bk);
	
	System.out.println("Sort on name");
	Collections.sort(bkList2,new CompareOnName());
	for(Book bk:bkList2)
		System.out.println(bk);
	
	int ch=0;
	Comparator<Book> comparator=null;
	Scanner sc=new Scanner(System.in);
	for(Book bk:bkList2)
		System.out.println(bk);
	do {
		System.out.println("1: sort on id 2: sort on name 3: sort on price 4: back");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
				comparator=new CompareOnId();
			break;
		case 2:
				comparator=new CompareOnName();
			break;
		case 3:
			comparator=new CompareOnPrice();
			break;
		case 4:
			break;
		default: System.out.println("Wrong choice");
			break;
		}
		if(ch!=4) {
		Collections.sort(bkList2,comparator);   //compare is called using dynamic polymorphism
		System.out.println("After sorting...");
		for(Book bk:bkList2)
			System.out.println(bk);
		}
	}
	while(ch!=4);
	
	System.out.println("Application ended");
	

	
	/*45 <->23 , "hi" <-> "hello"   (2,"java",600) <-> (1,"php",500)*/
	/*custom sorting : Comparator interfaces,  util, compare (2 objects to compare)
	 * sorting on only one property : Comparable  interface (lang ), compareTo(Object to compare)*/
/*
Comparable                                                             Comparator
sorting on basis of single property                    custom sorting
implement in same class                                       implemented in new diff classes
compareTo method used for comparision			compare method used for comparision
single parameter method										 method has 2 parameters
found in lang package 											found in util package

sort with one paramater needed							sort with 2 parameters needed
*/
}
}