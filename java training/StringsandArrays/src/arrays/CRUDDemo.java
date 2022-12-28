package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CRUDDemo {
public static void main(String[] args) throws IOException {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array:");
	int size=sc.nextInt();
	BookCRUD crud1=new BookCRUD(size);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int ch=0;
	do {
		System.out.println("1: ADD BOOK \n 2:UPDATE BOOK \n3: DELETE BOOK\n 4: SEARCH BOOK\n 5: DISPLAY BOOKS\n 6:BACK");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter Book Id");
			int id=sc.nextInt();
			System.out.println("Enter Book Name");
			String name=br.readLine();
			System.out.println("Enter Book Price");
			double price=sc.nextDouble();
			Book book=new Book(id,name,price); // Book Object created
			boolean b=crud1.addBook(book);
			if(b)
				System.out.println("Book Added successfully...");
			else
				System.out.println("Book insertion failed...");
			break;
		case 2:
			
			System.out.println("Enter exisiting id of book which you want to update");
			 id=sc.nextInt();
			 Book searchedBook=crud1.searchBook(id);
			 if(searchedBook!=null) {
				 System.out.println("What u want to update 1: Name 2: Price 3: Both");
				 int ch1=sc.nextInt();
				 switch (ch1) {
				case 1:
					
						System.out.println("Enter new name");
						 name=br.readLine();
						 searchedBook.setBookName(name);
					
					 /*Array not yet updated*/
					break;
				case 2:
					System.out.println("Enter new price");
					 price=sc.nextDouble();
					 searchedBook.setBookPrice(price);
					 /*Array not yet updated*/
						break;
				case 3:
					System.out.println("Enter new name");
					 name=br.readLine();
					 System.out.println("Enter new price");
					 price=sc.nextDouble();
					 searchedBook.setBookName(name);
					 searchedBook.setBookPrice(price);
					 /*Array not yet updated*/
				default: System.out.println("Wrong choice");
					break;
				}// end switch case
				boolean update= crud1.updateBook(searchedBook);
				if(update)
					System.out.println("Book updated Successfully..");
				else
					System.out.println("Book Updation failed...");
			 }// if ended
			 else {
				 System.out.println("Book not found to update");
			 }
			break;
		case 3:
			System.out.println("Enter existing id to delete the book");
			id=sc.nextInt();
			boolean delete=crud1.deleteBook(id);
			if(delete)
				System.out.println("Book deleted Successfully..");
			else
				System.out.println("Book Deletion failed...");
			break;
		case 4:
			System.out.println("Enter id to search book");
			 id=sc.nextInt();
			 searchedBook=crud1.searchBook(id);
			 if(searchedBook!=null)
				 System.out.println(searchedBook);
			 else
				 System.out.println("Book Not Found");
			break;
		case 5:
			crud1.display();
			break;
		case 6:
			break;
		default:
			break;
	}
	}while(ch!=6);
}
}