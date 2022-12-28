package varargs;





public class Demo {
/*var args can accept 0 to n similar type elements
 * one method can have only one variable argument
 * if method accepting normal parameters also the var arg should be last parameter*/
	public double add(double ...nums) {
		System.out.println("called");
		double sum=0;
		for(double ele:nums) {
			sum=sum+ele;
		}
		return sum;
	}
	public void test(String n, String ...names) {
		System.out.println(n);
		System.out.println("----");
		for(String nn:names)
				System.out.println(nn);
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.add());
		System.out.println(d.add(12));
		System.out.println(d.add(12,2));
		System.out.println(d.add(12,2,45,13));
		System.out.println(d.add(2,1,5,2,3,7,1,5));
		d.test("Hi" ,"Hello","Welcome");
	}
	
	
	
}