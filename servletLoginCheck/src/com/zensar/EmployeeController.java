package com.zensar;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

import com.zensar.beans.*;

public class EmployeeController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response){

		String requestAction = request.getParameter("requestAction");
		
		if(requestAction.equalsIgnoreCase("login"))
		{
			System.out.println("In controller login");
			String id = request.getParameter("id");
			String password = request.getParameter("password");
			System.out.println(id);
			
			EmployeeRepository er = new EmployeeRepository();
			boolean res = er.logincheck(id,password);
			
			if (res == true) {
				try {
					// RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					// rd.include(request, response);
					response.sendRedirect("index.jsp");
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("login Failed");
				request.setAttribute("errorMessage", "Invalid user or password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");

				try {
					rd.forward(request, response);
					// response.sendRedirect("loginForm.jsp");
				} catch (Exception e) {

					System.out.println("loginfailed catch" + e);
				}
			}
			
			
		}
		
//		else if (requestAction.equals("logoutmessage")) {
//			request.setAttribute("logoutmessage", "Logout Successfull");
//			RequestDispatcher rd = request.getRequestDispatcher("loginForm.jsp");
//
//			try {
//				rd.forward(request, response);
//				// response.sendRedirect("loginForm.jsp");
//			} catch (Exception e) {
//
//				System.out.println("loginfailed catch" + e);
//			}
//
//		}
	}	

		
	

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	
		
	}

	

}