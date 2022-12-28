package crud;

import java.util.ArrayList;
import java.util.List;

/*DAO : Data Access Object : It works on POJO*/
public class BookCRUD{
	List<Book> bookList;
	public static int i=0;
	
	public BookCRUD() {
		bookList=new ArrayList<>();
	}
	public boolean addBook(Book book) {
			if(book!=null) {
				boolean b=bookList.add(book);
				return b;
			}
			else
				return false;
	}
	public void display() {
		for(Book bk: bookList) 
			System.out.println(bk);
	}
	
	public Book searchBook(int bookId) {
		Book searchedBook=null;
		for(int j=0;j<bookList.size();j++) {
			Book bk=bookList.get(j);
			if(bk.getBookId()==bookId) {
				searchedBook=bk;
				break;
			}
		}// ended
		return searchedBook;  // null will returned if no book found
	}
	
	public boolean updateBook(Book updatedbook) {
		boolean replaced= false;
		for(int j=0;j<bookList.size();j++) {
			Book bk=bookList.get(j);
			if(bk.getBookId()==updatedbook.getBookId()) {
				bookList.set(j,updatedbook);
				replaced=true;
				break;
			}
		}
		return replaced;
	}
	public boolean deleteBook(int bookId) {
		boolean deleted=false;
		for(int j=0;j<i;j++) {
			Book bk=bookList.get(j);
			if(bk.getBookId()==bookId) {
				bookList.remove(j);
				deleted=true;
			}
		}// ended
		return deleted;
	}
}