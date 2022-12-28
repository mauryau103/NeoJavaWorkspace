package annonymous;

interface MyMath{
	double add(double ...e);
	double mult( double ...e);
}


public class AnnonymousDemo {
	// annonymous inner classes
	/*1. no name,
	 * 2. that class must be either subclass of any class/ abstract class, must implement an interface
	 so object of annonymous inner classes can be created with help of superclass or interface
	3. its object and body are contiguous, means no seperate body created for this class
	
	   use it only for faster implementation of interfaces or abstract classes
	*/
	
	public static void main(String[] args) {
		
        // upcasting
		MyMath math=new MyMath() {
			//own properties invisible, constructors not allowed
			@Override
			public double add(double... e) {
				double sum=0;
				for(double ele : e) {
					sum=sum+ele;
				}
				return sum;
			}
			@Override
			public double mult(double... e) {
				double mult=1;
				for(double ele : e) {
					mult=mult*ele;
				}
				return mult;
			}
		};
		
		System.out.println(math.add(12,34,56));
		System.out.println(math.mult(4,6,2));
	 
	}
	
}