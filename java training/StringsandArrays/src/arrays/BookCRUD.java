package arrays;

/*DAO : Data Access Object:It works on POJO*/

public class BookCRUD{
	Book bookArray[];
	public static int i=0;
	
	public BookCRUD() {
		// TODO Auto-generated constructor stub
		bookArray=new Book[5];
	}
	public BookCRUD(int size) {
		bookArray=new Book[size];
		System.out.println(bookArray.length);
	}
	
	public boolean addBook(Book book) {
		if(book!=null) {
					bookArray[i]=book;
					i++;
					return true;		
		}
		else {
			return false;
		}
		
	}
	public void display() {
		for(Book bk:bookArray) {
			System.out.println(bk);
			
		}
	}
	public Book searchBook(int bookId) {
		Book searchedBook=null;
		for(Book bk:bookArray) {
			if(bk.getBookId()==bookId) {
				searchedBook=bk;
				break;
			}
		}
		return searchedBook;
	}
	
	public boolean updateBook(Book updatedBook) {
		boolean replaced=false;
		for(int j=0;j<i;j++) {
			if(bookArray[j].getBookId()==updatedBook.getBookId()) {
				bookArray[j]=updatedBook;
				replaced=true;
				break;
			}
		}
		return replaced;
		
	}
	public boolean deleteBook(int bookId) {
		boolean deleted=false;
		for(int j=0;j<i;j++) {
			Book bk=bookArray[j];
			if(bk!=null && bk.getBookId()==bookId) {
				bookArray[j]=null;
				deleted=true;
			}
		}// ended
		return deleted;
	}
	
}