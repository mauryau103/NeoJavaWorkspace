package comparatordemo;

import java.util.Comparator;

import crud.Book;

public class CompareOnName implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
        int diff=b1.getBookName().compareTo(b2.getBookName());
		return diff;
	}

}