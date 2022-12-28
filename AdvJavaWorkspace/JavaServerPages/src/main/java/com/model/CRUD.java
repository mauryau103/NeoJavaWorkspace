package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.MyConnection;
import com.pojo.Employee;
public class CRUD  implements EmployeeDao{
	
	public boolean addEmployee(Employee em) {
		boolean b=false;
		String sql="insert into employee values(?,?,?)"; 
		try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql); 
			pstatement.setInt(1, em.getEmpId());
			pstatement.setString(2, em.getEmpName());
			pstatement.setDouble(3, em.getEmpSalary());
			System.out.println(pstatement);
			System.out.println(pstatement.getClass());
			
			  int no=pstatement.executeUpdate(); // do not pass sql here
			  System.out.println("Number of rows affected: "+no);
			  if(no>0)
				  b=true;
		} 
		  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Autoclosed");
		return b;
	}
	
	public boolean updateEmployee(Employee em) {
		boolean b=false;
		String sql="update employee set emp_name=?,salary=? where emp_id=?"; 
		try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql);
			pstatement.setInt(3, em.getEmpId());
			pstatement.setString(1, em.getEmpName());
			pstatement.setDouble(2, em.getEmpSalary());
			System.out.println(pstatement);
			int no=pstatement.executeUpdate(); 
			System.out.println("Number of rows affected: "+no);
			if(no>0)
				b=true;
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection Autoclosed");
		return b;

	}
	public boolean  deleteEmployee(int empId) {
		boolean b=false;
		String sql="delete from employee where emp_id=?"; 
		try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql);
			pstatement.setInt(1, empId);
			System.out.println(pstatement);
			int no=pstatement.executeUpdate(); 
			System.out.println("Number of rows affected: "+no);
			if(no>0)
				b=true;
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection Autoclosed");
		return b;
	}
	
	public Employee getEmployeeById(int empId) {
		Employee emp=null;
		String sql="select * from employee where emp_id=?";
		 try (Connection connection=MyConnection.connect()){	  
				PreparedStatement pstatement=connection.prepareStatement(sql);
				pstatement.setInt(1, empId);
				System.out.println(pstatement);
				ResultSet rset= pstatement.executeQuery();
				while(rset.next()) {
					int id=rset.getInt("emp_id");
					String name=rset.getString("emp_name");
					double salary=rset.getDouble("emp_salary");
					 emp=new Employee(id,name,salary);
				}
				
			} 
			  catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("Connection Autoclosed");
			return emp;
	}
	
	public List<Employee> getAllEmployees() {
	   String sql="select * from employee";
	   List<Employee> empList=new ArrayList<>();
	   try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql); // Statement
			ResultSet rset= pstatement.executeQuery();
			System.out.println(rset.getClass());
			// selected data is available in rset
				while(rset.next()) {
					int id=rset.getInt("emp_id");
					String name=rset.getString("emp_name");
					double salary=rset.getDouble("emp_salary");
					Employee emp=new Employee(id,name,salary);
					empList.add(emp);
				}
		} 
		  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Connection Autoclosed");
		return empList;
	} // method ended
		
	
	
	
	
	
	
	
	
}
