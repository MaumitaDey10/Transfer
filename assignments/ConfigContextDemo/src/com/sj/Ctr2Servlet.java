package com.sj;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ctr2Servlet
 */
@WebServlet(
		urlPatterns = { "/Ctr2Servlet" }, 
		initParams = { 
				@WebInitParam(name = "ctr2", value = "100")
		})
public class Ctr2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 int counter2; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ctr2Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		this.counter2= Integer.parseInt(config.getInitParameter("ctr2"));
		
		System.out.println("initial counter2="+counter2);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		this.counter2++;
		this.getServletContext().getAttribute("ctr1");
		response.getWriter().println("visitors of this servlet1"+this.getServletContext().getAttribute("ctr1"));
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
