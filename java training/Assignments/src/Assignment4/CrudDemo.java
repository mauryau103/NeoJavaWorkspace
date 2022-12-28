package Assignment4;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CrudDemo  {
public static void main(String[] args) throws IOException {
	
	Scanner sc=new Scanner(System.in);
	int size = 0;
	
		
	try {
		System.out.println("Enter size of array:");
	 size=sc.nextInt();
	}
	catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println(e);
		System.out.println("Enter valid value");
		
	}
	
	
	
	
	BookCRUD crud=new BookCRUD(size);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int ch=0;
	int id=0;
	String name="";
	double price=0;
	
	do {
		try {
			
		System.out.println("1: ADD BOOK \n 2:UPDATE BOOK \n3: DELETE BOOK\n 4: SEARCH BOOK\n 5: DISPLAY BOOKS\n 6:BACK");
		ch=sc.nextInt();
	} catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("Enter valid option");
		//sc.close();
		ch= 6;
	}
		
		
		switch (ch) {
		case 1:
			if(BookCRUD.i==size)
				System.out.println("Cant add Book. Array full");
			
		else {
			System.out.println("Enter Book Id");
			id=sc.nextInt();
			System.out.println("Enter Book Name");
			 name=br.readLine();
			System.out.println("Enter Book Price");
			 price=sc.nextDouble();
			Book book=new Book(id,name,price); // Book Object created
			boolean b=crud.addBook(book);
			if(b)
				System.out.println("Book Added successfully...");
			else
				System.out.println("Book insertion failed...");
		}
			break;
		case 2:
			System.out.println("Enter exisiting id of book which you want to update");
			 id=sc.nextInt();
			 Book searchedBook=crud.searchBook(id);
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
				boolean update= crud.updateBook(searchedBook);
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
			boolean delete=crud.deleteBook(id);
			if(delete)
				System.out.println("Book deleted Successfully..");
			else
				System.out.println("Book Deletion failed...");
			break;
		case 4:
			System.out.println("Enter id to search book");
			 id=sc.nextInt();
			  searchedBook=crud.searchBook(id);
			 if(searchedBook!=null)
				 System.out.println(searchedBook);
			 else
				 System.out.println("Book Not Found");
			break;
		case 5:
			crud.display();
			break;
		case 6:
			break;
		default:
			break;
	}
	}while(ch!=6);
	//Scanner sc = new Scanner(System.in);
	
	

	
Book bkArray[]= {new Book(1,"java",456), new Book(2,"php",333)};

	
	
	
}



}