package Assignment6;


import java.util.Comparator;

public class compareById implements Comparator<Book>{
	public int compare(Book s1, Book s2)
	{
		return s1.getId()-s2.getId();
	}
}