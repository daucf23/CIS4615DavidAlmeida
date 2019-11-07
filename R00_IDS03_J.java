/**************************************************************
*
* Rule 00, IDS 03 
* 
* Do not log unsanitized user input
*
* Completed on 11_7_2019
**************************************************************/




import java.util.logging.*;
import java.util.regex.Pattern;
import java.util.Scanner;


public class R00_IDS03_J {
	
	static Logger logger = Logger.getLogger(MyLogger.class.getName());
	
	
	public static void main(String[] args)
	{
		Scanner scanny = new Scanner(System.in);
		String check1 = "admin";
		String check2 = "admin";
		
		
		System.out.println("For this test, Login and Password are both 'admin'.\nYou can try using a non approved username by using @#$%! as the username. \n\n");

		
		System.out.println("User Login:");
		String username = new String(scanny.next());
		
		System.out.println("User Password:");
		String password = new String(scanny.next());
		
		boolean loginSuccessful = false;
		

		//check username and password to determine if login is allowed.
		if(username.compareTo(check1)== 0)
		{
			if(password.compareTo(check2)== 0) 
			{
				loginSuccessful = true;
			}
		}
		
		//improper implementation
		if (loginSuccessful == true) {
			  logger.severe("User login succeeded for: " + username);
			} else {
			  logger.severe("User login failed for: " + username);
			}
		
		//compliant check with sanitation
		if (loginSuccessful == true) {
			  logger.severe("User login succeeded for: " + sanitizeUser(username));
			} else {
			  logger.severe("User login failed for: " + sanitizeUser(username));
			}
		
		
		
	}
	//function to sanatize user input for the username field
	public static String sanitizeUser(String username) {
		  return Pattern.matches("[A-Za-z0-9_]+", username)
		      ? username : "unauthorized user";
	}

	public static class MyLogger 
	{
		static private String logs;
	}

	

}
