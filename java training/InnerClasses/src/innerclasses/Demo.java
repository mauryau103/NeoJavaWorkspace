package innerclasses;

import java.util.Comparator;

public class Demo {
public static void main(String[] args) {
		Company comp=new Company(123, "Neo"); 
		/* instance variables come in existence when
		object of that class comes in existence*/
		comp.setName("Neosoft  Tech");
		System.out.println(comp);
		// via object
		// inner class is member of another class
		// existence of inner class depends on existence of outer class
			
			Company.InhouseTrainer inhousetr=comp.new InhouseTrainer(99,45000);
		inhousetr.setSalary(67000);
		System.out.println(inhousetr); // toString
		inhousetr.testOuter();
		comp.testInner(inhousetr);
		// static inner class is static member of another class
		// existence of static inner  class does not depend on existence of outer class
		// only name of outer class is required
		Company.VisitingTrainer visitingtr=new Company.VisitingTrainer(333,2000);
		visitingtr.setPayPerHour(3000);
		visitingtr.accessOuterProperties(comp);
		comp.accessStaticInner(visitingtr);
		comp.test();
		
		// local class can extend any class, can extend any inteface can implement multiple interfaces
		class MethodLocal implements Runnable{
				@Override
				public void run() {
						System.out.println("in run");
				}

		}
			
		Runnable r=new MethodLocal();
		Thread thread=new Thread(r);
		thread.start();
		
		
		
}
}