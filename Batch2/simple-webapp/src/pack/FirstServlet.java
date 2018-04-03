package pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private int i=0;
    private int j=0;
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		i++;
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		j++;
		PrintWriter pw=response.getWriter();
		System.out.println("doGET()is called");
		pw.println("<html><body>");
		pw.println("<p>value of i="+i+", value of j ="+j);
		pw.println("</p></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		j++;
		PrintWriter pw=response.getWriter();
		System.out.println("doGET()is called");
		pw.println("<html><body>");
		pw.println("<p>value of i="+i+", value of j ="+j);
		pw.println("</p></body></html>");
	}

}
