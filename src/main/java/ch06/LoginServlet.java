package ch06;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/ch06/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userid");
		String userPwd = request.getParameter("userpwd");
		System.out.println("usreId :" + userId);
		System.out.println("userPwd :" + userPwd);
		doGet(request, response);
	}	

}
