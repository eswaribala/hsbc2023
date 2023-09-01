package com.aws.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessController
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/ProcessController" })
public class ProcessController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String[] sites=request.getParameterValues("site"); 
		 PrintWriter writer=response.getWriter();
		 response.setContentType("text/html");
		 try {
		 for(String site: sites) {
			 writer.println("<a href="+site+">Click Here</a>");
		 }
		 }
		 catch(NullPointerException ex) {
			 writer.println("Site Not Selected");
		 }
		
		
	}

}
