package com.sj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/welcome")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String userName= request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		if(password.equals("pass123")) {
			System.out.println("Welcome....username!"+userName);
		}
		else {
			//System.out.println("Invalid Credentials...please try again");
		
				RequestDispatcher rd = request.getRequestDispatcher("/invalid");
				rd.forward(request,response);
				//rd.include(request,response);
				}
		
			out.println("back here..");
				//System.out.println("dopost invoked..");
		//out.println("Welcome..."+userName+","+password);
		
		
		
	}

}
