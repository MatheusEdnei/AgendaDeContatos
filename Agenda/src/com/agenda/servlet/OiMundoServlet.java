package com.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = "/oi")
@WebServlet("/oi")
public class OiMundoServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("CLASSE OIMUNDOSERVLET");
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<h1>Oi Mundo Servlet</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}
	
}
