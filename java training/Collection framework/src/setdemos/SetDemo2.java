package setdemos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import comparatordemo.CompareOnId;
import comparatordemo.CompareOnName;
import comparatordemo.CompareOnPrice;
import crud.Book;

public class SetDemo2 {
 public static void main(String[] args) {
	 Set<Book> books2=new HashSet<>();
 	books2.add(new Book(2,"Java",600));
 	books2.add(new Book(1,"PHP",300));
 	books2.add(new Book(12,"CPP",400));
 	books2.add(new Book(10,"Core Java",600));
 	books2.add(new Book(13,"Java Basics",700));
 	books2.add(new Book(15,"Learn Python",650));
 	books2.add(new Book(14,"Web Basics",550));
 	books2.add(new Book(10,"Core Java",600));
 	books2.add(new Book(15,"Learn Python",650));
 	books2.add(new Book(14,"Adv Web Basics ",750));
 	
 	for(Book bk:books2) {
 		System.out.println(bk);
 	}
 	
 	/*12==12, hi==hi , (10,"Core Java",600) == (10,"Core Java",600)*/
 	
 	
 	System.out.println("--------------------------");
 	
 	Set<Book> books3=new TreeSet<>(new CompareOnPrice());
 	books3.add(new Book(1,"PHP",600));
 	books3.add(new Book(12,"CPP",400));
 	books3.add(new Book(10,"Core Java",600));
 	books3.add(new Book(13,"Java Basics",700));
 	books3.add(new Book(15,"Learn Python",650));
 	books3.add(new Book(14,"Web Basics",550));
 	books3.add(new Book(10,"Core Java",600));
 	books3.add(new Book(15,"Learn Python",650));
 	books3.add(new Book(14,"Adv Web Basics ",750));
 	
 	for(Book bk:books3) {
 		System.out.println(bk);
 	}
}
}