package homework1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/homework1/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// here we will set the content type first
		response.setContentType("text/html");
		
		//now we will create the html file here
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<body style= background-color:orange>");
		out.println("</body>");

		
		out.println("	<head>");
		out.println("		<title> REGISTRATION FORM</title>");
		
		out.println("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">");
		out.println("	</head>");
		out.println("	<body>");
		
		
		out.println("        <h1 style = text-align:center> <b><b><b>REGISTRATION FORM</b></b></b></h1>");
		
		out.println("		<h2><i><u><marquee>FILL THE FORM CORRECTLY IN ORDER TO GET ACCESS</marquee></u></i> </h2>");
		
		/*String username = request.getParameter("username");
		String password = request.getParameter("password");*/
		
		out.println("	</body>");
		out.println("</html>");
		
			
			out.println("		<form action=\"Register\" method=\"post\">");	
			
			out.println("	    <p> &#10122<em>FIRSTNAME</em>  &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"FIRSTNAME\" /></br>");					
			out.println("		<p> &#10123<em>LASTNAME</em>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"LASTNAME\"></br>");
			out.println("		<p> &#10124<em>PASSWORD</em>");
			out.println("		&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"PASSWORD\" /></br>");
			out.println("		<p> &#10125<em>RE-ENTER PASSWORD</em><input type=\"password\" name=\"RE-ENTERPASSWORD\" /></br>");			          
		    out.println("       <p> &#10126<em>EMAIL</em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"EMAIL\"/></br>");            
			out.println("       <p> &#10127<em>ZIPCODE</em> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"ZIPCODE\" /></br>");
			out.println("       <button type= \"submit\" class= \"btn btn-default\"> Submit</button>");
			
  	        out.println("		</form>");
			
		}
		
		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Homework1user> client = new ArrayList<Homework1user>();
		Homework1user ab=new Homework1user();
		HttpSession session=request.getSession();
		
		String er="";
        response.setContentType("text/html");
        String FIRSTNAME                =request.getParameter("FIRSTNAME");
        String LASTNAME                 =request.getParameter("LASTNAME");  
        String PASSWORD                 =request.getParameter("PASSWORD");
        String RE_ENTERPASSWORD         =request.getParameter("RE-ENTERPASSWORD");
        String EMAIL                    =request.getParameter("EMAIL");
        String ZIPCODE                  =request.getParameter("ZIPCODE");
        
        boolean error =true;
        PrintWriter out=response.getWriter();
        if(FIRSTNAME.equals(""))
        {
           er="PLEASE INSERT APPROPRIATE FIRSTNAME,THE FIELD SHOULD NOT BE BLANK";
           error=false;
        } 
        else
        {
        	
        	ab.setFIRSTNAME(FIRSTNAME);
        }        
                
        if(LASTNAME.equals(""))
        {
           er="PLEASE INSERT APPROPRIATE LASTNAME PLEASE,THE FIELD SHOULD NOT BE BLANK";
           error=false;
        } 
        else
        {
        	ab.setLASTNAME(LASTNAME);
        }
        
        
        
        
        
        
       
        
        
        
        
        
        
        
        if(PASSWORD.equals("") || RE_ENTERPASSWORD.equals(""))
        {
           er="PASSWORD OR RE_ENTERPASSWORD SHOULD NOT BE BLANK";
           error=false;
        } 
        else
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
        			er="must contain at least 1 number and 1 of the following characters: !@#$%^&*";
        		   
        		}
        	 } 
        	}	
        	
        	
        	
        	
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        if(EMAIL.equals(""))
        {
           er="INVALID EMAIL";
           error=false;
        } 
        else
        {
        	ab.setEMAIL(EMAIL);
        	if(!(EMAIL.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")))
        	{
        		er="INVALID EMAIL ID,PLEASE ENTER CORRECT EMAIL ID TO LOGIN";
        	}       	
        	
        	}
        
        
        
        if(ZIPCODE.equals(""))
        {
            er="ZIPCODE SHOULD NOT BE BLANK";
            error=false;
         } 
        
         else
         {
         	
        	if (ZIPCODE.matches("[0-9]+") && ZIPCODE.length() < 6 )
        	{
         		   System.out.println(" Matched ... ");
         		  ab.setZIPCODE(ZIPCODE);
         		} else {
         			er="ZIPCODE MUST CONTAIN ONLY NUMERIC VALUES AND THAT TO OF 5 DIGITS";
         			
         			
         		   
         		}
         	  
         	}	
		
		
		
        if(er.equals(""))
        {
        	System.out.println("WELCOME TO LOGIN PAGE");
        	 
        	 client.add(ab);
        	 session.setAttribute("user",client);
        	// getServletContext().setAttribute("user", client);
        	 response.sendRedirect("Welcome");
        	 
        }
         
         else{
            er="Correct the following Fields<br/>"+er; 
        /*    getServletContext().setAttribute("kd", er);*/
          
            out.println("<!doctype html>");
    		out.println("<html>");
    		
    		
    		out.println("	<head>");
    		out.println("		<title> REGISTRATION FORM</title>");	
    		out.println("		<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">");
    		out.println("	</head>");
    	
    		out.println("<body style= background-color:orange>");
    		
    		  out.println(er);   
    		out.println("        <h1 style = text-align:center> <b><b><b>REGISTRATION FORM</b></b></b></h1>");
    		out.println("		<h2><i><u>FILL THE FORM CORRECTLY IN ORDER TO GET ACCESS</u></i> </h2>");
    		
    	
    
    		
    			
    			out.println("		<form action=\"Register\" method=\"post\">");			
    			out.println("	    <em>FIRSTNAME</em> &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"FIRSTNAME\"  value="+FIRSTNAME+" /></br>");
    			out.println("		<em>LASTNAME</em>  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"LASTNAME\" value="+LASTNAME+" /></br>");
    			out.println("		<em>PASSWORD</em>");
    			out.println("		&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"PASSWORD\" value="+PASSWORD+" /></br>");
    			out.println("		<em>RE-ENTER PASSWORD</em><input type=\"password\" name=\"RE-ENTERPASSWORD\" value="+PASSWORD+" /></br>");			          
    		    out.println("       <em>EMAIL</em>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"EMAIL\"value="+EMAIL+" /></br>");            
    			out.println("       <em>ZIPCODE</em> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;<input type=\"text\" name=\"ZIPCODE\" value="+ZIPCODE+" /></br>");
    			out.println("       <button type= \"submit\" class= \"btn btn-default\"> Submit</button>");                    
      	        out.println("		</form>");
      			
        		out.println("	</body>");
        		out.println("</html>");
          
           
            }
	}

}
