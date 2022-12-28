package Assignment6;



import java.util.Comparator;

public class compareByPrice implements Comparator<Book>{
	public int compare(Book s1, Book s2)
	{
		return (int) (s1.getPrice()-s2.getPrice());
	}
}