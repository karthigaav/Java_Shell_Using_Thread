

import java.io.File;

public class Attrib extends Thread {

	private String name;

	public Attrib(String name)  {
		//creating a new object for the file class
		this.name = name;		
	} 
 
	public void run()
	{
		//getName();
		
		//creating a new object for the file class
		File file = new File(name); 
		//if the file path name is blank
		if(name.length()==0){
		System.out.println("User does not type the file path name");
		}
		else{
			//Checking whether the file exists or not
			if(file.exists()){
				//Checking whether the name is file or directory
				if(file.isDirectory()){
					//throwing error if the name is directory
					System.out.println("could not make the file read only because it is a directory");
				}
				else {
					//changing the file to read only mode
					boolean readOnlyInd =file.setReadOnly();
					System.out.println("Is this file readable (T/F)? " + readOnlyInd);
				}
			}
			else{
			//throwing error message if the file does not exists
			System.out.println("The file does not exist");
			}
		}
	}

	
}


