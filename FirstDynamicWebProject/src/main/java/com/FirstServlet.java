package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	public FirstServlet() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		
		writer.append("Hii...Welcome!!!");
		
	}

}
