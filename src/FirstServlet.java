

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FirstServlet
 */

public class FirstServlet implements Servlet {

	static{
		System.out.println("servlet loading");
	}
	public FirstServlet(){
		System.out.println("Servlet instantiation");
	}
	
	public void init(ServletConfig config){
		
		System.out.println("init method");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws IOException{
		System.out.println("service method");
		PrintWriter out = res.getWriter();
		out.println("<h1>MELCOW</h1>");
		
	}
	public void destroy(){
		System.out.println("Destry method");
	}
	public ServletConfig getServletConfig(){
		return null;
	}
	public String getServletInfo(){
		return null;
	}

	
	
}
