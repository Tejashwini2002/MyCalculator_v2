package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
	        "Why do Java developers wear glasses? Because they don't C#!",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
	        // Add more jokes here
	    };
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				String str1 = request.getParameter("num1");
				String str2 = request.getParameter("num2");
				// you must type caste the input values from String to Integer values (Parsing)
				
		        String str3 = request.getParameter("bt1"); // In this String str3, we are fetching the value specified in the button tag
		        
		        String randomJoke = "Sorry, No Jokes";
		       
				try {
			    int randomIndex = (int) (Math.random() * jokes.length);
			    randomJoke = jokes[randomIndex];
				
				int num1 = Integer.parseInt(str1);
				int num2 = Integer.parseInt(str2);
				int ans;
				String error_message = "Can't divide by zero";
				if (num2 == 0) {
					response.sendRedirect("NewFile.jsp?ans="+error_message+"&joke="+randomJoke);
					
				}else {
			    if(str3.equals("1")) ans= num1 + num2;
				else if(str3.equals("2")) ans= num1 - num2;
				else if(str3.equals("3")) ans= num1 * num2;
				else ans=num1/num2;
				
				//response.getWriter().append("Served at: ").append(request.getContextPath());
				//response.getWriter().append("Ans = "+ans);
				//Now we will send a jsp file as a Response instead of just printing the answer.
//				response.sendRedirect("NewFile.jsp?ans="+ans); // Along with the jsp file we are also sending the answer by putting a ? here.
			
				
			     
				response.sendRedirect("NewFile.jsp?ans="+ans+"&joke="+randomJoke); // I have written here NewFile.jsp. You should write whatever name you have given to the jsp file.
				// In the above line, I am also sending the joke alon with jsp file and answer. You can send the jokes by fetching from the array as done here, or you can even integrate the API.
				}
				
				}catch(NumberFormatException e) {
				 String exception_message = "Input is not having valid integers";
//				response.getWriter().append("Input is not having valid integers");
				 response.sendRedirect("NewFile.jsp?ans="+ exception_message+"&joke="+randomJoke);
			}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
