package impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connection.MyConnection;
import pojo.Account;

/*
 * 1. Connect To Database
 * 2. Define and prepare a query
 * if a query is hardcoded then create Statement object
 * 3. Fire Query : type of query 4. Collect Result
 * insert, update, delete : DML : Data Manipulate Language
 * executeUpdate(sql);
 * 
 * select : DQL : Data Query Language
 * executeQuery(sql)
 * 
 * create, alter, truncate, drop :DDL 
 * execute , DML/DQL/DDL/DCL
 * 5. Close the connection   : try with resources : autoclosed*/
public class CRUD  implements AccountDao{
	// create update method, delete method to update and delete the records	
	public boolean addAccount(Account ac) {
		boolean b=false;
		String sql="insert into Account values(?,?,?,?)"; // ? : wil later replaced by actual
		// to prepare this query we need to use PreparedStatement object (interface)
		try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql); // sql must be passed here
			// ? : Account_no : int 
			pstatement.setInt(1, ac.getAccountNo());
			//? : CustId : int
			pstatement.setInt(2, ac.getCustId());
			//? : Type : String
			pstatement.setString(3, ac.getAccType());
			//? : balance : double
			pstatement.setDouble(4, ac.getBalance());
			
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
	
	public boolean updateAccount(Account ac) {
		boolean b=false;
		String sql="update Account set customer_id=?,emp_salary=? where emp_id=?"; 
		try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql);
			pstatement.setInt(3, ac.getCustId());
			pstatement.setString(1, ac.getEmpName());
			pstatement.setDouble(2, ac.getEmpSalary());
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
	public boolean  deleteAccount(int accId) {
		boolean b=false;
		String sql="delete from employee where emp_id=?"; 
		try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql);
			pstatement.setInt(1, accId);
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
	
	public Account getAccountById(int accId) {
		Account emp=null;
		String sql="select * from employee where emp_id=?";
		 try (Connection connection=MyConnection.connect()){	  
				PreparedStatement pstatement=connection.prepareStatement(sql);
				pstatement.setInt(1, accId);
				System.out.println(pstatement);
				ResultSet rset= pstatement.executeQuery();
				while(rset.next()) {
					int id=rset.getInt("emp_id");
					String name=rset.getString("emp_name");
					double salary=rset.getDouble("emp_salary");
					 acc=new Account(id,name,salary);
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
	
	public List<Account> getAllAccounts() {
	   String sql="select * from employee";
	   List<Account> empList=new ArrayList<>();
	   try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql); // Statement
			ResultSet rset= pstatement.executeQuery();
			System.out.println(rset.getClass());
			// selected data is available in rset
				while(rset.next()) {
					int id=rset.getInt("emp_id");
					String name=rset.getString("emp_name");
					double salary=rset.getDouble("emp_salary");
					Account emp=new Account(id,name,salary);
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

	@Override
	public boolean deleteAccount(int accId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountById(int accId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAccount(impl.Account acc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateAccount(impl.Account acc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public impl.Account getAccountById(int accId) {
		// TODO Auto-generated method stub
		return null;
	}
		
	
}