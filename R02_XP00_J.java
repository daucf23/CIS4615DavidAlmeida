/**************************************************************
*
* Rule 02, XP00 
* 
* Do not ignore values returned by methods
*
* Completed on 11_7_2019
**************************************************************/


import java.io.File;

public class R02_XP00_J {
	
	public static void main(String[] args) 
	{
		System.out.println("We will now attempt to delete a file\n");
		deleteFileBad();
		System.out.println("We do not know if we were able to succesfully\nor unsuccessfully delete the file");
		System.out.println("\n\nNow we will attempt to delete a file the compliant way");
		deleteFileProper();
		 
		 
	
		
	}
	
	//non compliant method for file deletion
	public static void deleteFileBad(){
		 
		  File someFile = new File("someFileName.txt");
		  // Do something with someFile
		  someFile.delete();
		 
		}
	
	//compliant method for file deletion
	public static void deleteFileProper(){
		 
		  File someFile = new File("someFileName.txt");
		  // Do something with someFile
		  if (!someFile.delete()) {
		    // Handle failure to delete the file
			 //System.out.println("File could not be deleted");
			 throw new IllegalArgumentException("\nSEVERE: Could not Delete File!");
		  }
		 
		}
	
	

}
