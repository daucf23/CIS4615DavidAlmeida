/**************************************************************
*
* Rule 03, NUM 03 
* 
* Do not ignore values returned by methods
*
* Completed on 11_7_2019
*
**************************************************************/

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class R03_NUM03_J {

	public static void main(String[] args) throws IOException
	{
		InputStream in = new FileInputStream("\\inputr03");
		System.out.println("Large number has been entered:");
		DataInputStream is = new DataInputStream(in); 
		
		System.out.println("Performing task 1");
		int num = getIntegerBad(is);
		System.out.println("Non compliant version result: " + num);
		long num2 = getIntegerProper(is);
		System.out.println("Compliant version result: " + num2);
	}

	public static int getIntegerBad(DataInputStream is) throws IOException {
	  return is.readInt(); 
	}


	public static long getIntegerProper(DataInputStream is) throws IOException {
	  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
	}
	
	
}