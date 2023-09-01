package com.aws.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/RegistrationController" })
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Enumeration<String> enumData=request
				.getParameterNames();
		PrintWriter out=response.getWriter();
		boolean status=false;
		while(enumData.hasMoreElements()) {
			
			if(request.getParameter(enumData.nextElement())
					!=null)
				status=true;
			else
				status=false;				
		}
		
		if(status)
			request.getRequestDispatcher("SuccessController")
			.forward(request, response);
		else
		{
			request.setAttribute("error", "Registration Failed..");
			request.getRequestDispatcher("ErrorController")
			.include(request, response);
			request.getRequestDispatcher("index.html")
			.include(request, response);
		}
		
		
	}

}
