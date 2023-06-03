package com.calc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServ
 */
//@WebServlet("/CalcServ")
public class CalcServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    		response.setContentType("text/html");
    		PrintWriter out = response.getWriter();

    		
    		try {
		double num1 = Double.parseDouble(request.getParameter("num1"));
		double num2 = Double.parseDouble(request.getParameter("num2"));
		String op = request.getParameter("op");
		
		double res = 0;
		

		
		
			
		
		 if(op.equals("+")) 
		 {
			 res = num1 + num2;
		 }
		 else if(op.equals("-"))
		 {
			 res = num1 - num2;
		 }
		 else if(op.equals("*"))
		 {
			 res = num1 * num2;
		 }
		 else if(op.equals("/"))
		 {
			 res = num1 / num2;
		 }
		 else if(op.equals("%"))
		 {
			 res = num1 % num2;
		 }
		 
		 
		 
		 out.print(res);
		 
		}
		//request.getRequestDispatcher("calculator.html").include(request, response);
		catch(Exception e)
		{
			out.print("Problem Occured.");
		}
		 
		 
		 
	}

}
