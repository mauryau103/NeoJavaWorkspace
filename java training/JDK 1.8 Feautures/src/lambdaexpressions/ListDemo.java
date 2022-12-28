package lambdaexpressions;

import java.util.HashSet;
import java.util.Set;

public class ListDemo {
public static void main(String[] args) {
	Book b1=new Book(1, "java", 600.00);
	Book b2=new Book(2, "java", 600.00);
	Book b3=new Book(3, "java", 600.00);
	Book b4=new Book(4, "java", 600.00);
	Book b5=new Book(5, "java", 600.00);
	Book b6=new Book(6, "java", 600.00);
	Set<Book> myset=new HashSet<>();
	myset.add(b1);
	myset.add(b2);
	myset.add(b3);
	myset.add(b4);
	myset.add(b5);
	myset.add(b6);
	
	myset.forEach(book->System.out.println(book));
	System.out.println("---------------");
	myset.forEach(System.out::println);
	
}
}