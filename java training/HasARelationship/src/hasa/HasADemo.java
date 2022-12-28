package hasa;

import hasa.Address;
import hasa.Employee;

public class HasADemo {
    public static void main(String[] args) {
        Address add=new Address("Yamuna Nivas","kolkata","Maharashtra");

        Employee emp=new Employee(123, "hari", 34000,add);
        System.out.println(emp);
        // display city of employee emp   getAddress  getCity
       String ct=emp.getAddress().getCity();
        System.out.println(ct);
        // display address of employee
        System.out.println("Address is :"+emp.getAddress());
        // change state of employee address to "West Bengal"
        emp.getAddress().setState("West Bengal");
    }
}