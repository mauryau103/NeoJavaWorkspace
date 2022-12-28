package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.CRUD;
import com.pojo.Employee;
import com.pojo.Employee2;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  CRUD crud=new CRUD();
		  HttpSession session=request.getSession(); String
		  userAction=request.getParameter("act");
		  if(userAction.equalsIgnoreCase("getall")) 
		  { 
			  List<Employee> empList=crud.getAllEmployees(); 
			  session.setAttribute("eList",empList);
			  response.sendRedirect("EmployeeList.jsp"); 
		  }
		 
		  else if(userAction.equalsIgnoreCase("delete")) 
		  { 
			  int id=Integer.parseInt(request.getParameter("id")); 
			  System.out.println(id);
		  
			  boolean b=crud.deleteEmployee(id); 
			  if(b) 
				  response.sendRedirect("EmployeeServlet?act=getall"); 
			  else
				  response.sendRedirect("Error.jsp");
		  } 
		  else if(userAction.equalsIgnoreCase("get")) 
		  { 
			  int id=Integer.parseInt(request.getParameter("id")); 
			  Employee employee=crud.getEmployeeById(id); 
			  if(employee!=null) {
				  session.setAttribute("employee",employee); 
				  System.out.println(employee);
				  response.sendRedirect("UpdateEmployee.jsp"); 
			  }
			  else
				  response.sendRedirect("Error.jsp");
		  }
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CRUD crud=new CRUD();
		String userAction=request.getParameter("act");
		if(userAction.equalsIgnoreCase("add")) {
			int empId=Integer.parseInt(request.getParameter("empId")); //new
			String empName=request.getParameter("empName");
			double empSalary=Double.parseDouble(request.getParameter("empSalary"));
			String qual=request.getParameter("qual");
			//Employee2 emp=new Employee2(empId, empName, empSalary, qual);
			Employee emp=new Employee(empId,empName,empSalary,qual); //
			boolean b=crud.addEmployee(emp);
			if(b) 
				response.sendRedirect("EmployeeServlet?act=getall"); // fresh new req to same Servlet, doGet
			
			else 
				response.sendRedirect("Error.jsp");
			
		}
		else if(userAction.equalsIgnoreCase("update")) {
			
			  int empId=Integer.parseInt(request.getParameter("empId")); 
			  // existing 
			  String empName=request.getParameter("empName"); 
			  double empSalary=Double.parseDouble(request.getParameter("empSalary")); 
			  String qual=request.getParameter("qual"); 
			  
			  Employee emp=new Employee(empId,empName,empSalary,qual); 
			  boolean b=crud.updateEmployee(emp);
			  if(b) 
				  response.sendRedirect("EmployeeServlet?act=getall"); 
			  else  
			  	response.sendRedirect("Error.jsp"); 
			 
		}
	}

}