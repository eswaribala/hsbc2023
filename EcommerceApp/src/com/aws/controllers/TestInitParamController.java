package com.aws.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestInitParamController
 */
@WebServlet(
		asyncSupported = true, 
		urlPatterns = { "/TestInitParamController" }, 
		initParams = { 
				@WebInitParam(name = "url", value = "http://www.aws.com")
		})
public class TestInitParamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestInitParamController() {
        super();
        // TODO Auto-generated constructor stub
    }

    private String url;
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.url=config.getInitParameter("url");
	}



	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 PrintWriter writer=response.getWriter();
		 response.setContentType("text/html");
		//servlet config
	     writer.println("<a href="+this.url+">Click Here</a>");
		//servlet context
	    ServletContext ctx= getServletContext();
	    int score=Integer.parseInt(ctx.getInitParameter("score"));
	    score++;
	    writer.println("<h4>Score="+score+"</h4>");
	}

}
