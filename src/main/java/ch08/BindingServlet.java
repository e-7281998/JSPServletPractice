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
//@WebServlet("/binding")
@WebServlet("/setContext")
public class BindingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		request.setAttribute("address", "서울시 마포구");
		//데이터 같이 전송 못함. 날아감
		//response.sendRedirect("binding2");
		
		//RequestDispatcher dis = request.getRequestDispatcher("binding2");
		//dis.forward(request, response);

		ServletContext context = getServletContext();
		List member = new ArrayList<>();
		member.add("유재석");
		member.add(10);
		context.setAttribute("member", member);
		
		PrintWriter out = response.getWriter();
		out.println("<p>유재석 - 10</p>");
	} 

}
