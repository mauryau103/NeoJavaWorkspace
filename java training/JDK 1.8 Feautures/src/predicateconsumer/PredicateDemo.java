package predicateconsumer;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDemo {
public static void main(String[] args) {
	
	Predicate<Integer> pr=new Predicate<Integer>() {
		@Override
		public boolean test(Integer age) {
			if(age>=18)
			return true;
			else return false;
		}
	};
	boolean b=pr.test(78);
	System.out.println(b);
	
	Predicate<Integer> pr2=age->age>=18;
	
	boolean b2=pr2.test(2);
	System.out.println(b2);
	
	
	String ss="India is my country";
	
	Predicate<String>p2=s->s.startsWith("India");

	boolean b3=p2.test(ss);
	System.out.println(b3);
	
	List<String> empList=new LinkedList<>();
	empList.add("Abhay");
	empList.add("Vibhash");
	empList.add("Anil");
	empList.add("Rupam");
	empList.add("Avinash");
	empList.add("Akshata");
	empList.forEach(emp->System.out.println(emp));
	// Filter employees names starting with A
	System.out.println("Displaying filtered employees");
	Stream<String> filteredStream=empList.stream().filter(emp->emp.startsWith("A"));
   filteredStream.forEach(emp->System.out.println(emp));
	
   empList.stream().filter(emp->emp.startsWith("A")).forEach(emp->System.out.println(emp));
	
   
   
   
   
	
}
}