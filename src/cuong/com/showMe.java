package cuong.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionLogin
 */
@WebServlet("/showMe")
public class showMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	 
	 protected void doGet(HttpServletRequest request,
	           HttpServletResponse response) throws ServletException, IOException {
	        
	       ServletOutputStream out = response.getOutputStream();
	        
	       out.println("<html>");
	       out.println("<head><title>Hello Servlet</title></head>");
	        
	       out.println("<body>");
	       out.println("<h3>Hello World</h3>");
	       out.println("This is my first Servlet");
	       out.println("</body>");
	       out.println("<html>");
	   }
	}



