

import java.io.File;

public class Mkdir extends Thread {
    private File file = null;
	private boolean bool = false;
	private String name;

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

	public Mkdir(String name){	
		this.name = name;
			
	}
	  public void run(){
		      
		            file = new File(name);
		  
					if(name.length()==0){
					    
						// throwing error if the name is not entered
						System.out.println("could not create the directory because the path name is not entered");
					}
					
					   else  {
						   // The file class creates a directory with a given name and updates bool
					       bool = file.mkdir();
					       // when the file is created the bool is changed 
					       System.out.println("Directory created? " +bool);
					       
					       // checking whether the bool is false
					       if(bool == false) {
						     // throwing error if it is false i.e the directory already exist
						     System.out.println("could not create the directory because the directory name already exist");			
		  }
						
				}
					}
					
				}
				
	  


