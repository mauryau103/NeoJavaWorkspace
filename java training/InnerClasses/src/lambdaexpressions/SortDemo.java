package lambdaexpressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortDemo {
public static void main(String[] args) {

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
	Collections.sort(bkList2, (Book b1, Book b2)->b1.getBookId()-b2.getBookId()); 
	for(Book bk:bkList2)
		System.out.println(bk);
	
	System.out.println("Sort on price");
	Collections.sort(bkList2,(Book b1, Book b2)->(int)(b1.getBookPrice()-b2.getBookPrice())); 
	for(Book bk:bkList2)
		System.out.println(bk);
	
	System.out.println("Sort on name");
	Collections.sort(bkList2,(Book b1, Book b2)->b1.getBookName().compareTo(b2.getBookName()));
	for(Book bk:bkList2)
		System.out.println(bk);
	/*
	 * int ch=0; Comparator<Book> comparator=null; Scanner sc=new
	 * Scanner(System.in); for(Book bk:bkList2) System.out.println(bk); do {
	 * System.out.println("1: sort on id 2: sort on name 3: sort on price 4: back");
	 * ch=sc.nextInt(); switch (ch) { case 1: comparator=new CompareOnId(); break;
	 * case 2: comparator=new CompareOnName(); break; case 3: comparator=new
	 * CompareOnPrice(); break; case 4: break; default:
	 * System.out.println("Wrong choice"); break; } if(ch!=4) {
	 * Collections.sort(bkList2,comparator); //compare is called using dynamic
	 * polymorphism System.out.println("After sorting..."); for(Book bk:bkList2)
	 * System.out.println(bk); } } while(ch!=4);
	 */
	
	System.out.println("Application ended");

}
}