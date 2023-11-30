package Servlet;

import jakarta.servlet.ServletException;
 
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Calculate
 */
 
public class Calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculate() {
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
		
		int z=0;
		String a =request.getParameter("zero");
		String b =request.getParameter("six");
		String c =request.getParameter("the");
		String d =request.getParameter("is");
		String e =request.getParameter("on");
		 
		 
		 if(a.equals("aa"))
		 {   	 
		 z++;
		 }
		  
		 
		 
		 if(b.equals("ba"))
		 {   	 
		 z++;
		 }
		 
		 
		 if(c.equals("ca"))
		 {   	 
		 z++;
		 }
		 
		 if(d.equals("da"))
		 {   	 
		 z++;
		 }
		 
		 if(e.equals("ea"))
		 {   	 
		 z++;
		 }
		 
		  
		 
		 if(z==5)
		 {   	 
		   out.print(" congratulation !!! you got full marks ");
		 }
		 
    else {
			 out.print( "your have scored"+z+"points" );			 
		 }
		 
		 
		
		 }

}


 