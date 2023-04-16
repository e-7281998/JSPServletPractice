package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		//out.println("<p>sendRedirect 연습</p>");
		//out.println("<p>refresh를 이용한redirect 연습</p>");
		//out.println("<p>location을 이용한redirect 연습</p>");

		//String name = request.getParameter("name");
		//out.println("<p>sendRedirect로 보낸 데이터 받기 ) name : "+name+"</p>");
		
		out.println("<p>dispatcher를 이용한 forward 연습</p>");
	}

}
