package Assignment6;

import java.util.Scanner;
import java.util.Scanner;
import java.util.TreeSet;

public class Booksort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		TreeSet<Book> book = null;

		do {
			System.out.println("Enter for sorting book by");
			System.out.println("1 for Name");
			System.out.println("2 for Id");
			System.out.println("3 for Price");
			System.out.println("4 for exit");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					book = new TreeSet<Book>(new compareByName());

					book.add(new Book(12,"Java",(float)123.35));
					book.add(new Book(11,"Python",(float)23.35));
					book.add(new Book(10,"HTML",(float)45.35));
					book.add(new Book(9,"CSS",(float)56.35));
			
					for (Book ele : book) {
						System.out.println(ele);
					}
					break;
				case 2:
					book = new TreeSet<Book>(new compareById());

					book.add(new Book(12,"Java",(float)123.35));
					book.add(new Book(11,"Python",(float)23.35));
					book.add(new Book(10,"HTML",(float)45.35));
					book.add(new Book(9,"CSS",(float)56.35));
					
					for (Book ele : book) {
						System.out.println(ele);
					}
					break;

				case 3:
					book = new TreeSet<Book>(new compareByPrice());

					book.add(new Book(12,"Java",(float)123.35));
					book.add(new Book(11,"Python",(float)23.35));
					book.add(new Book(10,"HTML",(float)45.35));
					book.add(new Book(9,"CSS",(float)56.35));
		
					for (Book ele : book) {
						System.out.println(ele);
					}
					break;
				default:
					break;
			}
			
		} while (choice != 4);	
		sc.close();
	}
}