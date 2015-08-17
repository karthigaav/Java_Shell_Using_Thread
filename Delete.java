

import java.io.*;

public class Delete extends Thread{
 
	private File file;
	private String name;
	public Delete(String name) {
       this.name = name;
  }

 public void run() {
	  
	 file = new File(name);
	//if the file path name is blank
			if(name.length()==0){
				System.out.println("User does not type the file path name");
			}
			else {
				//Checking whether the file exists or not
	               if(file.exists()){      
	            	 //Checking whether the name is file or directory
			          if(file.isDirectory()) {
			        	//throwing error if the name is directory
			        	  System.out.println("could not delete because the file path or name is a directory");
					 }
					 else {
						 //function for deleting the given file name
			          	file.delete();
				            System.out.println("The file name is deleted");
				     }
				 }
	               else{
	       			//throwing error message if the file does not exists
	       			System.out.println("The file does not exist");
	       			}
				 }

  }

}
