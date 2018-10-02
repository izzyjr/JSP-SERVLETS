package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple Servlet", urlPatterns = { "/SimpleServlet" },

	initParams = {@WebInitParam(name="defaultUser", value="John Doe")}
		
)
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from get method!");
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();

		if (userName != "" && userName != null) {
			session.setAttribute("savedUserName", userName);
			context.setAttribute("savedUserName", userName);
		}
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<h3>Hello From Servlet GET Method - Web Page View</h3>");
		writer.println("<h3>Hello " + userName + "!</h3>");
		writer.println("<h3>Request Parameter has Username: " + userName + "</h3>");
		writer.println("<h3>Session Parameter has Username: " + (String) session.getAttribute("savedUserName") + "</h3>");
		writer.println("<h3>Context Parameter has Username: " + (String) context.getAttribute("savedUserName") + "</h3>");
		writer.println("<h3>Init Parameter has defaultUser: " + getServletConfig().getInitParameter("defaultUser"));

	}

}
