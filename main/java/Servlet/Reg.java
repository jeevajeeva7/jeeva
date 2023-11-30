package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

 

/**
 * Servlet implementation class Reg
 */
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reg() {
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
		
		String a =request.getParameter("father");
		String b =request.getParameter("mother");
		String c =request.getParameter("address");
		String d =request.getParameter("phone");
		String e =request.getParameter("city");
		String f =request.getParameter("state");
		String g =request.getParameter("username");
		String h =request.getParameter("password");
		
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(e);
		 System.out.println(f);
		 System.out.println(g);
		 System.out.println(h);
		 
		 Servlet1.validate(a, b, c, d, e, f, g, h);
		 
		 
		 PrintWriter pt=response.getWriter();
		 pt.print(" register sucessfully ");
		
		 
		}

	}


