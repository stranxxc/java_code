package ch11_01_servlet_demo_dxc_53;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet_02_webservlet.action")
public class servlet_02_webservlet extends HttpServlet {

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String to_path="/index.jsp";
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("to_path");
		// Ìø×ªµ½ index.jsp
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("index.jsp");
	}

	
	public void init() throws ServletException {
		// Put your code here
	}

}
