
import java.io.File;

public class Rmdir extends Thread {
	  /* Command:
	           mkdir name
	           Action:
	           make a directory in the path of the name.
	           Errors:
	           The user enters:
	           1. dir                 The name is missing.
	           2. dir name            But name is already exist.

	           When there is an error println a message and return (not exit).
	  */
	// The file object is set to null using File class initially for this class to access
    private File file = null;
 // The bool variable is declare as a boolean data type in-order to track the files operation
	private boolean bool = false;
	private String name;
	
	  public Rmdir(String name){
	    this.name = name;
	  }

	  public void run() {
		  
					// returns path names of files and directory
					file = new File(name);
					//if the file path name is blank
					if(name.length()==0){
						 System.out.println("The path name is not specified");
					}
					// check whether the file exists or not
					else if(file.exists()){
						        // checking whether it is a Directory or not
								if(file.isDirectory()){
								   // Removing or deleting the file using the delete object in File class and 
									//updating the bool 
								   bool = file.delete();
								   // prints whether directory removed or not
								System.out.println("Directory Removed? " +bool);
								} else {
									// throwing error because its not a directory
									System.out.println("The Rmdir command cannot be performed because it is not a Directory");
								}
						 } else{
						 System.out.println("The file does not exist");
						 
					}
	  }

}
