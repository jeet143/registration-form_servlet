package lab2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/homework1/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Login() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<body style= background-color:orange>");
		out.println("		<form action=\"Login\" method=\"post\">");	

		out.println("		<h1> YOU ARE PERFECTLY LOGGED IN </h1>");		
		out.println("	    <p> &#10122<em>USERNAME</em><input type=\"text\" name=\"USERNAME\" /></br>");					
		out.println("		<p> &#10123<em>PASSWORD</em><input type=\"password\" name=\"PASSWORD\" /></br>");
		out.println("       <div class=\"checkbox\">    <label>    <input type=\"checkbox\"> REMEMBER ME   </label>  </div>");		
		out.println("       <button type= \"LOGIN\" class= \"btn btn-default\"> LOGIN </button>");
		 
		out.println("</body>");			
		out.println("	<head>");			
		out.println("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">");
		out.println("    ");
		out.println("	</head>");
		
		System.out.println(request.getSession().getAttribute("user"));
		
		//cookie initialized
		Cookie Cookie = new Cookie("lab2hash", "value");
		Cookie.setMaxAge(60*60*24*14); // cookie stored for 14days
		response.addCookie(Cookie);
		
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<lab2> client = new ArrayList<lab2>();
		lab2 ab=new lab2();
		HttpSession session=request.getSession();
		
		String er="";
        response.setContentType("text/html");
        String USERNAME                 =request.getParameter("USERNAME");
        String PASSWORD                 =request.getParameter("PASSWORD");
        
        boolean error =true;
        PrintWriter out=response.getWriter();
        if(USERNAME.equals(""))
        {
           er="PLEASE INSERT APPROPRIATE USERNAME,THE FIELD SHOULD NOT BE BLANK";
           error=false;
        } 
        
                
        /*if(LASTNAME.equals(""))
        {
           er="PLEASE INSERT APPROPRIATE LASTNAME PLEASE,THE FIELD SHOULD NOT BE BLANK";
           error=false;
        } 
        else
        {
        	ab.setLASTNAME(LASTNAME);
        }*/
                
         if(PASSWORD.equals("") )
        {
           er="PASSWORD OR RE_ENTERPASSWORD SHOULD NOT BE BLANK";
           error=true;
        } 
        /*else
        {
        	if (!PASSWORD.equals(RE_ENTERPASSWORD)) {
        		er="PASSWORD AND RE_ENTERPASSWORD SHOULD BE SAME";
        		error=false;        		
							}
        	else
        	{
        		Pattern pattern = Pattern.compile("[!@#$%^&*]");
        		Pattern patternNUM = Pattern.compile("[0-9]");
        		Matcher matcher = pattern.matcher(PASSWORD);
        		Matcher matcherNUM = patternNUM.matcher(PASSWORD);
        		if (matcher.find() && matcherNUM.find()) {
        		   System.out.println(" Matched ... ");
        		   ab.setPASSWORD(PASSWORD);
        		   ab.setREENTERPASSWORD(RE_ENTERPASSWORD);
        		} else {
        			er="must contain at least 1 number and 1 of the following characters: !@#$%^&*";*/
        		   
         
         
         			response.sendRedirect("welcome");
         
         
        		}   	 
        		
        	
        	
		 }

