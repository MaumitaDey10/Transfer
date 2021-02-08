package com.sj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifecycleDemo
 */
@WebServlet("/LifecycleDemo")
public class LifecycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifecycleDemo() {
        super();
        // TODO Auto-generated constructor stub
        
        System.out.println("instanciated....");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		
		System.out.println("init invoked...initialization code...");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
		System.out.println("destroy invoked...");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("do get invoked....");
		
		PrintWriter  out= response.getWriter();
		out.println("<b><I>Lifecycle Demo</I></b>");
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
