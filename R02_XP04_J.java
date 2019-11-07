/**************************************************************
*
* Rule 02, XP04 
* 
*  Do not pass arguments to certain Java Collections Framework 
*  methods that are a different type than the collection parameter type
*
* Completed on 11_7_2019
**************************************************************/

import java.util.HashSet;

public class R02_XP04_J {
  public static void main(String[] args) {
      System.out.println("Here is an example of the non-compliant version.");
      nonCompliantMethod();
      System.out.println("\n\n\nHere is an example of the compliant version.");
      compliantMethod();
    }
  
  public static void nonCompliantMethod() 
  {
    
        HashSet<Short> s = new HashSet<Short>();
        for (int i = 0; i < 10; i++) {
          s.add((short)i); // Cast required so that the code compiles
          s.remove(i); // Tries to remove an Integer (this is the problem)
        }
        System.out.println(s.size());
  }
  
  public static void compliantMethod()
  {
    HashSet<Short> s = new HashSet<Short>();
      for (int i = 0; i < 10; i++) {
        s.add((short)i);
        
        // Remove a Short
        if (s.remove((short)i) == false) {
          System.err.println("Error removing " + i);
        }
      }
      System.out.println(s.size());
  }
}