

import java.io.*; 


public class Dir extends Thread {
 
	private File file;
	private String name;
	
	public Dir(String name){
		this.name = name;
  }

  public void run(){
		
	  file = new File(name);
		//Checking whether the file exists	 
		 if(file.exists()) {
			 
		    // listOfFiles array is created to store all the files and folders in the specified path
			File[] listOfFiles = file.listFiles(); 
				 
			    // Looping is done for printing the array
		        for(int i=0;i<listOfFiles.length;i++) {
		        	// Print by listing all the files and folders of the given path
			        System.out.println(listOfFiles[i].getName());
			    }
		    
		            //Checking whether the file not exists
				    if(!file.exists()) {
				    	// throwing error if the directory does not exist
						 System.out.println("The directory name does not exist");
					}			 
		}
  }

	


}
				 
