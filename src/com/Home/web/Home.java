package com.Home.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String language= request.getParameter("language");
		String town= request.getParameter("town");
		


		if(fname==null) {
			fname="unknown";
		}
		if(lname==null) {
			lname="unknown";
		}
		if(language==null) {
			language="unknown";
		}
		if(town==null) {
			town="unknown";
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>wellcome "+ fname+ " "+lname+"</h1>" );
		out.write("<h4>Your favorite language "+language+"</h4>" );
		
		out.write("<h4>Your Home town is  "+town+"</h4>" );


		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
