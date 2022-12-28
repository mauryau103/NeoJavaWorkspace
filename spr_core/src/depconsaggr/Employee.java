package depconsaggr;

import java.util.Iterator;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	
	List addr;

	public Employee(int id, String name, List addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	
	public void show() {
		System.out.println("Id is :"+id+"\n Name is :"+name);
		
		Iterator iterator=addr.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}
}
