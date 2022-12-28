package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import impl.CRUD;
import pojo.Employee;

public class CRUDDemo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		CRUD crud=new CRUD();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch=0;
		do {
			System.out.println("Operations on Employees");
			System.out.println("1: insert, 2; update  3: delete  4: search 5: select all 5: exit");
			ch=Integer.parseInt(br.readLine());
			switch(ch) {
			case 1:
				System.out.println("Enter Employee details:");
				System.out.println("Enter id");
				int id=Integer.parseInt(br.readLine());		
				System.out.println("Enter name");
				String name=br.readLine();	
				System.out.println("Enter salary");
				double salary=Double.parseDouble(br.readLine());		
				Employee emp=new Employee(id,name,salary);
				// emp : Data carrier (pojo)		
				boolean b=crud.addEmployee(emp);
				if(b)
					System.out.println("Employee added.....");
				else
					System.out.println("Failed......");
				break;
			case 2:
				System.out.println("Update  Employee details:");
				System.out.println("Enter existing id to update details");
				 id=Integer.parseInt(br.readLine());			
				 Employee searchedEmp=crud.getEmployeeById(id);
				 System.out.println("Searched :"+searchedEmp);
				 System.out.println("What u want to update");
				 System.out.println("1:name 2: salary 3: both 4: back");
				 int choice=Integer.parseInt(br.readLine());
				 switch (choice) {
				case 1:			
					System.out.println("Enter new name");
					name=br.readLine();
					searchedEmp.setEmpName(name);
					break;
				case 2:
					   System.out.println("Enter new salary");
					   salary=Double.parseDouble(br.readLine());			
		              searchedEmp.setEmpSalary(salary);
					break;
				case 3:
					System.out.println("Enter new name");
					name=br.readLine();
					 System.out.println("Enter new salary");
					   salary=Double.parseDouble(br.readLine());		
					   searchedEmp.setEmpName(name);
					    searchedEmp.setEmpSalary(salary);
					break;
				case 4:
					break;
				default:System.out.println("Wrong choice");
					break;
				}
				if(choice==1 || choice==2 || choice==3)
				{
					b=crud.updateEmployee(searchedEmp);
					if(b)
						System.out.println("Employee updated........");
					else
						System.out.println("Failed............");
				}
				break;
			case 3:
				System.out.println("Enter existing id to delete employee");
				 id=Integer.parseInt(br.readLine());
				 b= crud.deleteEmployee(id);
				 if(b)
						System.out.println("Employee deleted........");
					else
						System.out.println("Failed............");
				 break;
			case 4:
				System.out.println("Enter existing id to search employee");
				 id=Integer.parseInt(br.readLine());
				 searchedEmp= crud.getEmployeeById(id);
				if(searchedEmp!=null)
						System.out.println(searchedEmp);
				else
					System.out.println("Employee not found");
				break;
			case 5:
				List<Employee> eList=crud.getAllEmployees();
				//method reference
				System.out.println(eList.size());
				if(eList.isEmpty())
					System.out.println("No Records to display....");
				eList.forEach(System.out::println);
				break;
			case 6:
			break;
			 default: System.out.println("Wrong choice");
			}
		}while(ch!=6);

	}
}