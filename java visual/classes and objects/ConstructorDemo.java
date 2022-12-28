class Employee1{  
    int empId;  
    String firstName,lastName;
    double empSalary;
    /* used to initialize the object after it is created. called implicitly when new statement 
     * gets executed
     * construct name should be same as class name
     * constructrs can be privte, default, prtected, public
     * Constructors can be overloaded
     */
    Employee1(){
        System.out.println("in Constructor");
        empId=100;
        firstName="AAA";
        lastName="ZZZ";
        empSalary=1000;
    }
    Employee1(int id,String fname, String lastName, double salary){
        empId=id;
        firstName=fname;
        this.lastName=lastName;
        empSalary=salary;
    }
    String getDetails(){  
        return "Id :"+empId+" Name:"+firstName+" "+lastName+" Salary:"+empSalary;
    }
    String getName(){
        return firstName+" "+lastName;       
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Employee1 emp1=new Employee1();// call goes to matching constructor
        String details=emp1.getDetails();
        System.out.println(details);

        Employee1 emp2=new Employee1();// call goes to matching constructor
        String details2=emp2.getDetails();
        System.out.println(details2);
        emp2.empSalary=34000;
        emp1.empId=340;
        emp2.lastName="Kumar";
        System.out.println("...1...");
       details=emp1.getDetails();
        System.out.println(details);
         System.out.println("...2...");
        details2=emp2.getDetails();
        System.out.println(details2);

        Employee1 emp3=new Employee1(555, "Vina", "Patil", 56000);
        System.out.println(emp3.getDetails());
        Employee1 emp4=new Employee1(666, "Krupa", "Pawar", 66000);
        System.out.println(emp4.getDetails());
    }
}