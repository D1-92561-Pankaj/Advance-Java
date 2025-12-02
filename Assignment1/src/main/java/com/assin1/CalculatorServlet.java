package com.assin1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet(value = "/calculate", loadOnStartup = 1)

public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		String choice = request.getParameter("action");
		int res = 0;
		
		switch(choice) {
		case "add":
			res = num1 + num2;
			break;
		case "subtract":
			res = num1 - num2;
			break;
		case "multiply":
			res = num1*num2;
			break;
			
		case "divide":
			res = num1/num2;
			break;
		}
		
		PrintWriter pw = response.getWriter();
		pw.write("<h3>"+choice+" :" +res+"</h3>");
		
		pw.write("<h3><a href = 'calc.html'>+Go Back</a></h3>");
		
		
		
		
		
		
	}

}
