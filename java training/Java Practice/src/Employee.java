public class Employee{
	public int empId;
	public String empName;
	public double basicSalary,grossSalary,netSalary;
	public double ta,da,hra,pf;
	protected final double pt=1200;
	
	public double calGross() {
		System.out.println("In Employee");
		ta=0.1*basicSalary;
		da=0.12*basicSalary;
		hra=0.2*basicSalary;
		grossSalary=basicSalary+ta+da+hra;
        return grossSalary;
	}
	public double calNet(){     
        pf=0.06*basicSalary;
        netSalary=grossSalary-pt-pf;
        return netSalary;
    }
	
	public String toString() {
		return "id:"+empId+" name:"+empName+" basic salary:"+basicSalary;
	}
	
}