package setdemos;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import comparatordemo.CompareOnId;
import comparatordemo.CompareOnName;
import comparatordemo.CompareOnPrice;
import crud.Book;


public class SetDemo {
		public static void main(String[] args) {
			
			/*HashSet, LinkedHashSet, TreeSet*/
			/*Set : unordered(insertion order not followed) , unique(duplicate overrides),non indexed
			 * HashSet : unordered, null
			 * LinkedHashSet: ordered, null
			 * Treeset : unordered, sorted , null not allowed*/
			
			Set<String> names= new HashSet<>();
			names.add("hari");
			names.add("pari");
			names.add("harish");
			names.add("girish");
			names.add(null);
			names.add(null);
			names.add("girish");
			names.add("manish");
			names.add("pooja");
			System.out.println(names);
			System.out.println("----------");
			Set<String> names1= new LinkedHashSet<>();
			names1.add("hari");
			names1.add("pari");
			names1.add("pari");
			names1.add("harish");
			names1.add(null);
			names1.add(null);
			names1.add("girish");
			names1.add("manish");
			names1.add("pooja");
			names1.remove("girish"); // dont have remove with index
			System.out.println(names1);
			System.out.println("----------");
			Set<String> names2= new TreeSet<>();
			names2.add("hari");
			names2.add("pari");
			names2.add("pari");
			names2.add("harish");
			names2.add("girish");
			names2.add("manish");
			names2.add("pooja");
			System.out.println(names2);
			
			Set<Integer> ageSet=new HashSet<>();
			ageSet.add(23);
			ageSet.add(26);
			ageSet.add(13);
			ageSet.add(33);
			ageSet.add(24);
			
			ageSet.remove(33);  // 33: element
			System.out.println(ageSet);
			
			for(int ele:ageSet)
					System.out.println(ele);
			System.out.println("-------");		
			Iterator<Integer> itr=ageSet.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
			
			itr=ageSet.iterator();
			while(itr.hasNext()){
				int ele=itr.next();
				if(ele==24)
					itr.remove();
			}
			System.out.println(ageSet);
			
			
			Set<Book> books=new TreeSet<>(); // automatically sort
			books.add(new Book(2,"Java",600));
			books.add(new Book(1,"PHP",300));
			books.add(new Book(12,"CPP",400));
			books.add(new Book(10,"Core Java",600));
			books.add(new Book(13,"Java Basics",700));
			books.add(new Book(15,"Learn Python",650));
			books.add(new Book(14,"Web Basics",550));
			
            for(Book b:books)
        	   	System.out.println(b);
            
            System.out.println("------------");
        	Set<Book> books2=new TreeSet<>( new CompareOnName()); // automatically sort
        	books2.add(new Book(2,"Java",600));
        	books2.add(new Book(1,"PHP",300));
        	books2.add(new Book(12,"CPP",400));
        	books2.add(new Book(10,"Core Java",600));
        	books2.add(new Book(13,"Java Basics",700));
        	books2.add(new Book(15,"Learn Python",650));
        	books2.add(new Book(14,"Web Basics",550));
			
            for(Book b:books2)
        	   	System.out.println(b);
        	Set<String> mySet=Set.of("Hi","hello"); // immutable
    		//mySet.add("asdd"); // can not add
		}
	
	
		
}