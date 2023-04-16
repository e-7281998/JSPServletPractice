package ch08;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BindingServlet
 */
@WebServlet("/binding")
public class BindingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		request.setAttribute("address", "서울시 마포구");
		//데이터 같이 전송 못함. 날아감
		//response.sendRedirect("binding2");
		RequestDispatcher dis = request.getRequestDispatcher("binding2");
		dis.forward(request, response);

	} 

}
