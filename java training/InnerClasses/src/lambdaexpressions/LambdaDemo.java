package lambdaexpressions;
//interface having only one method declaration: Functional Interface
public class LambdaDemo {

	public static void main(String[] args) {
		MathIntf math = new MathIntf() {
			
			@Override
			public double square(double num) {
				// TODO Auto-generated method stub
				return num*num;
			}
		};
		double res=math.square(3);
		System.out.println("Square is :"+res);
		//()->{} : this arrow
		MathIntf math2=(double num)->{return num*num;};
		
		double res1=math2.square(4);
		System.out.println("Square is :"+res1);
		// lets remove optional things]
		/*1. no need to write datatype of parameter
		 * 2. if single parameter only : then () are optional
		 * 3. if single stmt : {} optional
		 * 4. if single return sttmt then : {} optional, return keyword not allowed, function automatically
		 * returns a result*/
		
		MathIntf math3=num->num*num;
		double res2=math3.square(5);
		System.out.println("Square is :"+res2);
	}
}
