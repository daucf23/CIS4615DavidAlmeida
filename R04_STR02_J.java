//STR02-J. Specify an appropriate locale when comparing locale dependent information

// in progress 11_6_2019

public class R04_STR02_J 
{    
  public static void main(String[] args) 
  {
    
    String s = new String();
    s = "title";
  
    
    processTagBad(s);
    System.out.println("when not properly handled: " + s);
    System.out.println("\n\n\n");
    
    s = "title";
    
    processTagProper(s);
    System.out.println("When properly handled: ");




 
  }
  
  //Non-Compliant code for locales
  public static void processTagBad(String tag) {
      if (tag.toUpperCase().equals("SCRIPT")) {
        return;
      }
      // Process tag
    }
  
  
  //Compliant code
  public static void processTagProper(String tag) {
      if (tag.toUpperCase().equals("SCRIPT")) {
        return;
      }
      // Process tag
    }
  
  
  
}




