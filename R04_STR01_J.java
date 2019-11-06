// STR01-J. Do not assume that a Java char fully represents a Unicode code point

import java.lang.*;

public class R04_STR01_J 
{
  public static void main(String[] args)
  {
    String s = new String();
    s = "0x123456";
    String result = new String();
    String result2 = new String();
    
    System.out.println("Here is the string we started with: " + s + "\n");
    
    System.out.println("Here is the string with bad method:");
    result = trimBad(s);
    System.out.println(result);
    
    System.out.println("Here is the string with proper method:");
    result2 = trimProper(s);
    System.out.println(result2);
    
    
    
  }
  
  //this is the bad method
  public static String trimBad(String string) {
      char ch;
      int i;
      for (i = 0; i < string.length(); i += 1) {
        ch = string.charAt(i);
        if (!Character.isLetter(ch)) {
          break;
        }
      }
      return string.substring(i);
    }
  
  
  //this is the method that counts the number of characters in a string
  public static String trimProper(String string) {
      int ch;
      int i;
      for (i = 0; i < string.length(); i += Character.charCount(ch)) {
        ch = string.codePointAt(i);
        if (!Character.isLetter(ch)) {
          break;
        }
      }
      return string.substring(i);
    }
  
  
  
  

}