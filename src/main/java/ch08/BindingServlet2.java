package ch08;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BindingServlet
 */
//@WebServlet("/binding2")
@WebServlet("/getContext")
public class BindingServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//String address = (String)request.getAttribute("address");
		//out.println("<p>address : "+address+"</p>");
		
		ServletContext context = getServletContext();
		List member = (ArrayList)context.getAttribute("member");
		for(int i=0; i<member.size(); i++) {
			out.println(member.get(i).toString());
		}
		
	} 

}
