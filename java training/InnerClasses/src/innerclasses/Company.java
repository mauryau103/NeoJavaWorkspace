package innerclasses;

public class Company {
		private  int id;
		private String name;
		public static int count;
		public Company() {
			// TODO Auto-generated constructor stub
			count++;
		}
		public Company(int id, String name) {
			super();
			this.id = id;
			this.name = name;
			count++;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public class InhouseTrainer{
				public int trId;
				public  double salary;
				public static final int trCount=3; /*in inner classess static final prperties allowed but not only static*/
				/*The field trCount cannot be declared static in a non-static inner type, unless initialized with a constant expression*/
				public InhouseTrainer(int trId,double salary) {
					this.trId=trId;
					this.salary = salary;
				}	
				public int getTrId() {
					return trId;
				}
				public void setTrId(int trId) {
					this.trId = trId;
				}
				public double getSalary() {
					return salary;
				}
				public void setSalary(double salary) {
					this.salary = salary;
				}				
				@Override
				public String toString() {
					return "InhouseTrainer [trId=" + trId + ", salary=" + salary + "]";
				}

				// inside inner class method we can access outer class properties (private also)
				public void testOuter(){
					System.out.println("Properties of Outer class directly accessed in inner class method");
					System.out.println(id);
					System.out.println(name);
					System.out.println(count);
					outerMethod();
				}
				
				//The method innerMethod cannot be declared static; static methods can only be declared in a static or top level type
			//	public static void innerMethod() {}
		}// inner class gets ended
		
		@Override
		public String toString() {
			return "Trainer [id=" + id + ", name=" + name + "]";
		}
		// outer class can not directly access properties of inner class, but can be accessed via obect (private also)
		public void testInner(InhouseTrainer ih) {
			System.out.println("Properties of inner class  accessed via object of inner class in outer class method");
			System.out.println(ih.salary);
			System.out.println(ih.trId);
			System.out.println(InhouseTrainer.trCount);
		}
  // try creating static method
		
		public static void outerMethod() {
			System.out.println("just to test");
		}
	
		private class Inner{
			
		}
		public void createOb() {
			Inner inn=new Inner();
		}
		
		
		public static class VisitingTrainer{
			private  int trId;
			private  double payPerHour;
			public VisitingTrainer() {
				// TODO Auto-generated constructor stub
			}
			public VisitingTrainer(int trId, double payPerHour) {
				this.trId = trId;
				this.payPerHour = payPerHour;
			}
			public int getTrId() {
				return trId;
			}
			public void setTrId(int trId) {
				this.trId = trId;
			}
			public double getPayPerHour() {
				return payPerHour;
			}
			public void setPayPerHour(double payPerHour) {
				this.payPerHour = payPerHour;
			}
			@Override
			public String toString() {
				return "VisitingTrainer [trId=" + trId + ", payPerHour=" + payPerHour + "]";
			}
			public void accessOuterProperties(Company c) {
				// Static inner class can not directly access properties of Outer class, but Static properties visible
				//via object accessible (private also)
				System.out.println("Accessing Outer class properties in static n class method");
				System.out.println(count);
				System.out.println(c.id);
				System.out.println(c.name);
			}
		}// Static nested classes ended here
		public void accessStaticInner(VisitingTrainer vt) {
			System.out.println("Accessing Static inner class properties in Outer class method");
			System.out.println(vt.trId);
			System.out.println(vt.payPerHour);
		}
		
		
		public void test() {
			 int m=45;
			 /*any local class can not be private, default, protected, public*/
			 /*bydefault : local scope*/
			class Local{
				int l;
				
				public void  localMethod() {
					System.out.println(m);
				}
			}
			
			Local local=new Local();
			local.l=78;
			System.out.println(local.l);
			local.localMethod();
			
		}// method ended
		
		
		
		
}// outer classes ended 