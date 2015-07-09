package homework1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/homework1/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();	
       // out.println("<center><h1><b><big><u>....WELCOME....</u></big></b></h1></center>");
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>WELCOME </title>");
		out.println("</head>");
		
		
		
		out.println("<body bgcolor = 'FF9933'>");
		out.println("CONGRATULATIONS USER.....YOU ARE WELCOMED BECAUSE YOU HAVE FILLED THE WHOLE FORM CORRECTLY,</br>NOW YOU CAN LOGIN EASILY  &nbsp");
		out.println("<a href = 'Login' >LOGIN </a>");
		
		//out.println(c);
		
		out.println("</body>");
		out.println("</html>");
    }
		
		
		
		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
