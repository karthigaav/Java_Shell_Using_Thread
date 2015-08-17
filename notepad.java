
import java.lang.Thread;
public class Notepad extends Thread{
	  
	  //public Notepad(){
	  //  f();
	 // }

	// private void f() {
	 //      run();
	 // }
	 
	public void run()
	{
		try {   
			
		   // print a message
           System.out.println("Executing notepad.exe");
           
           // create and execute notepad.exe
           Runtime.getRuntime().exec("notepad.exe");
           
           // prints the message when notepad.exe pops up
           System.out.println("notepad should open now");
		 } catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	

	}
