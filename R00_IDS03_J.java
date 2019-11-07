import java.util.logging.*;
import ;

//in progress 11_5_2019

public class R00_IDS03_J {
	
	public static void main(String[] args)
	{
		System.out.println("User login");
		
		
		
	}
	
	//improper implementation
	if (loginSuccessful) {
		  logger.severe("User login succeeded for: " + username);
		} else {
		  logger.severe("User login failed for: " + username);
		}
	
	
	//proper implementation with sanatize user function
	if (loginSuccessful) {
		  logger.severe("User login succeeded for: " + sanitizeUser(username));
		} else {
		  logger.severe("User login failed for: " + sanitizeUser(username));
		}
	public String sanitizeUser(String username) {
		  return Pattern.matches("[A-Za-z0-9_]+", username))
		      ? username : "unauthorized user";
		}
	

}
