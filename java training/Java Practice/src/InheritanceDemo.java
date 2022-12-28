public class InheritanceDemo{
	public static void main(String args[]) {
		
		Employee emp = new Employee();
		emp.empId=123;
		emp.empName="Umesh maurya";
		emp.basicSalary=23000;
		System.out.println(emp);
		
		double gs=emp.calGross();
		System.out.println("Gross Salary is:"+emp.grossSalary);
		System.out.println("Gross Salary is:"+gs);
		
		double ns=emp.calNet();
        System.out.println("Gross salary is:"+emp.netSalary);
        System.out.println("Gross salary is:"+ns);
        
        System.out.println("------Manager-------------");
        
        Manager mgr = new Manager();
        mgr.empName="Akshat";
        mgr.empId=4455;
        mgr.basicSalary=45000;
        mgr.setBranch("Sales");
        System.out.println(mgr); // manager toString

        double gsm=mgr.calGross();
        System.out.println("Gross salary is:"+mgr.grossSalary);
        System.out.println("Gross salary is:"+gsm);

        double nsm=mgr.calNet();
        System.out.println("Gross salary is:"+mgr.netSalary);
        System.out.println("Gross salary is:"+nsm);
        
        showGross(emp);
        showGross(mgr);
		
	}
	public static void showGross(Employee e) {
		
		System.out.println("Display Gross Salary of employee/manager");
		double gs=e.calGross();
		System.out.println("Gross salary is :"+gs);
		
	}
}