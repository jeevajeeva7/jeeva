package Servlet;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

 

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();	 
		
		 
		String n =request.getParameter("name");
		String p =request.getParameter("password");
		 System.out.println(n);
		 System.out.println(p);
		 
		if(Servlet1.validate(n, p))		 {
		   RequestDispatcher rd=request.getRequestDispatcher("home.html");
		   rd.forward(request, response);
		 }
		
		
		else
		{
			
	      out.print("Sorry username or password error ");
	      RequestDispatcher rd = request.getRequestDispatcher("login.html");
	      rd.include(request, response);
		}
		  out.close();
		}

	
		
	}

