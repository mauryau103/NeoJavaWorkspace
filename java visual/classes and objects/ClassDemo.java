class Employee{ /*Capital case */

    /* Primitive data types
     * primitive data types can not break further.
     * byte,short,int,long
     * float:double
     * boolean :0/1:false,true
     * 
    */
    /*String : class */
    //Instance variable.
    int empId; /*camel case */
    String firstName,lastName;
    double empSalary;

    String getDeails(){/*camel case */
        return "Id :"+empId+" Name: "+lastName+" Salary:"+empSalary;
    }

    String getName(){

        return firstName+" "+lastName;
    }
}
public class ClassDemo{
    public static void main(String[] args) {
        
        Employee emp1;/*this variable will point to object of type employee */
        emp1=new Employee(); /*memory allocated to object on run time thats why java is dynamic */
        System.out.println(emp1.empId);
        System.out.println(emp1.firstName);
        System.out.println(emp1.lastName);
        System.out.println(emp1.empSalary);
        String details=emp1.getDeails();
        System.out.println(details);
        emp1.empId=32456;
        emp1.empSalary=4500;
        emp1.firstName="Umesh";
        emp1.lastName="Maurya";
        System.out.println(emp1.empId);
        System.out.println(emp1.firstName);
        System.out.println(emp1.lastName);
        System.out.println(emp1.empSalary);


    }
}