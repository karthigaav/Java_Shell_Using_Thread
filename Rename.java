

public class Rename extends Thread {
  /* Command:
             rename nameA nameB
             Action:
             Renames the file nameA to the file nameB.
             Use your classes Copy and Delete for this.
             Errors:
             The user enters:
             1. rename              The names nameA and nameB are missing.
             When there is an error println a message and return (not exit).
    */
private String name;

  public Rename(String name) {
    this.name = name;
  }

  public void run() {
	  
	  //copy class is called to copy the contents to the new name file
	 // Copy.Rename(name);
	  (new Copy(name)).start();
      try {
		(new Copy(name)).join();
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	}
	  System.out.println(name);
	  
	  // now Split the paths to delete the old name file
	  String[] names = name.split(" ");
	  
	  //Deleting the old name
	  //Delete.f(names[0]);
	  (new Delete(names[0])).start();
	  System.out.println(names[0]);
      try {
		(new Delete(names[0])).join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   
	  // Prints the renamed file path
	  System.out.println("The Renamed file is: " + names[1]);
	
}
}
