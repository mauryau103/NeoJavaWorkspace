package staticdemo;

public class NeoEmployee {
	
	public int empId;
	public String empNameString;
	public double basicSalary;
	
	public static  String companyNameString;
	
	static {
		System.out.println("Static Executed");
		companyNameString="Neosoft Technologies";
		
	}
	
	
	
}