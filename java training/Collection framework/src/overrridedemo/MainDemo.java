package overrridedemo;

import java.util.ArrayList;
import java.util.List;

public class MainDemo {
public static void main(String[] args) {
	
	MyList list=new MyList();
	list.add("hi");
	list.add("hello");
	System.out.println(list);
	
	List<String> list1=new ArrayList<String>();
	List<String> list2=new ArrayList<String>();
	List<List<String>> combine=new ArrayList<>();
	combine.add(list1);
	combine.add(list2);
}
}