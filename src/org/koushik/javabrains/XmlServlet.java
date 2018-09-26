package org.koushik.javabrains;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML Servlet called - doGet");
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello from GET Method: " + userName + "!</h1>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("XML Servlet called - doPost");
		response.setContentType("text/html");
		String userName = request.getParameter("userName");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello from POST Method: " + userName + "!</h1>");
	}
	
}
