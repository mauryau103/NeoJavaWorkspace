package Assignment6;


import java.util.Comparator;

public class compareByName implements Comparator<Book> {
	public int compare(Book s1, Book s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}