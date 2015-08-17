

import java.util.Date;
import java.text.DateFormat;

/* Command:
           time
           Action:
           the current time is 

displayed.
  */

public class MyTime extends Thread{
 
//public MyTime(){
   
//}

public void run(){
    
	// the cur_time object is created using the Date class
    Date cur_time = new Date();
    
    // used the default style and locale to format date and time.
    DateFormat formatter = DateFormat.getTimeInstance();
    
    // Prints the time with a local formatter.
    System.out.println(formatter.format(cur_time));

}

}

