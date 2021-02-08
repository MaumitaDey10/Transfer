package com.sj;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ctr1Servlet
 */
@WebServlet(
		urlPatterns = { "/Ctr1Servlet" }, 
		initParams = { 
				@WebInitParam(name = "ctr1", value = "500")
		})
public class Ctr1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int counter1;
       ServletContext context;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ctr1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.counter1= Integer.parseInt(config.getInitParameter("ctr1"));
		
		System.out.println("initial counter1="+counter1);
		
		context=this.getServletContext();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		this.counter1++;
		
		context.setAttribute("ctr1", counter1);
		
		response.getWriter().println("visitors of this servlet1" + counter1);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
