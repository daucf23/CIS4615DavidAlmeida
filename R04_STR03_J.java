/**************************************************************
*
* Rule 04, STR 03
* Make sure to properly cast to string
* do not encode non-character data to strings
*
*
**************************************************************/




import java.math.BigInteger;

public class R04_STR03_J 
{    
  public static void main(String[] args) 
  {
  	System.out.println("This is what happens when you encode \nnon-character data into a string");
	badMethod();
	System.out.println("\nThis is what you do when you properly \ncast data types to strings");
	properMethod();
    
  }

  	//There is no proper handling of integer to string in this method

	public static void badMethod(){
		BigInteger x = new BigInteger("530500452766");
		byte[] byteArray = x.toByteArray();
		String s = new String(byteArray);
		System.out.println(s);
		byteArray = s.getBytes();
		x = new BigInteger(byteArray);
	}


	//This is the proper method, with the .toString() method applied to the BigInteger

	public static void properMethod(){
		BigInteger x = new BigInteger("530500452766");
		String s = x.toString();  // Valid character data
		System.out.println(s);
		byte[] byteArray = s.getBytes();
		String ns = new String(byteArray); 
		x = new BigInteger(ns); 
	}

}