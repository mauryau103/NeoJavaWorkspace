package kunal;

public class Employee {
	int id;
	String name;
	Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display() {
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.country+address.state);
	}
	
	public static void main(String[] args) {
		Address address=new Address("Khadavali", "Maharashtra", "India");
		Employee employee = new Employee(123,"Umesh", address);
		employee.display();
	}
}
