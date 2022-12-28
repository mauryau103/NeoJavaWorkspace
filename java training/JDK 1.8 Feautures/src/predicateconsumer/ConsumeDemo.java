package predicateconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumeDemo {
public static void main(String[] args) {
	
	Consumer<String> consume1=new Consumer<String >() {
		@Override
		public void accept(String t) {
			System.out.println(t);
		}
	};
	consume1.accept("Neosoft");
	
	Consumer<Integer> consume2=num->System.out.println(num);
	consume2.accept(345);
	
	List<String> stringList=new ArrayList<>();
	stringList.add("Mumbai");
	stringList.add("Mumbai");
	stringList.add("Pune");
	stringList.add("Satara");
	
	System.out.println(stringList);
	
	Consumer<String> con=s->System.out.println(s);
	stringList.forEach(con);
	System.out.println("-----------------------");
	stringList.forEach(s->System.out.println(s));
}
}