package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("UserName");
		String password = request.getParameter("PassWord");
		
		request.setAttribute("Name", name);
		request.setAttribute("Password", password);
		 
	
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
		requestDispatcher.forward(request, response);
	}
	

}
