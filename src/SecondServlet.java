

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class SecondServlet
 */

public class SecondServlet extends GenericServlet {

	/**
	 * GenericServlet is an abstract class and implements ServletConfig, Servlet and Serializable
	 * 
	 *  Implementation of GenericServlet
	 *  
	 *  public class GenericServlet implements Servlet, ServletConfig, Serializable{
	 *  
	 *  	private transient ServletConfig config;
	 *  
	 *  	public void init(ServletConfig config){
	 *  		this.config = config;
	 *  		init();
	 *  	}
	 *  	public void init() throws ServletException{
	 *  		// for programmers purpose;		
	 *  	}
	 *  	public ServletConfig getServletConfig(){
	 *  		return config;
	 *  	}
	 *  	
	 *  		
	 *  }
	 * @throws IOException 
	 *  
	 */
	public void service(ServletRequest req,ServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		out.println("Hello From Generic Servlet!!");
	}

}
