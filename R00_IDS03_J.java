public class ROO_IDS03_J 
{
	
	public static void main(String[] args)
	{

		if(loginSuccessful)
		{
			logger.severe("User login succeeded for: " + username);
		} else {
			logger.severe("User login failed for: " + username);
		}




		if(loginSuccessful){
			logger.severe("USer login succeeded for: " + sanatizeUser(username));
		} else {
			logger.severe("User login failed for: " + sanatizeUser(username));
		}
		public String sanitizeUser(String username) {
  			return Pattern.matches("[A-Za-z0-9_]+", username))
     			 ? username : "unauthorized user";
}


	}

}