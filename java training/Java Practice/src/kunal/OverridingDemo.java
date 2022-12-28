package kunal;

class Vehicle{
	int id=7;
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Car extends Vehicle{
	void run() {
		System.out.println("Car is Running");
	}
}
public class OverridingDemo {
	public static void main(String[] args) {
		Vehicle car=new Car();
		car.run();
//		car.id;
	}
	
}
