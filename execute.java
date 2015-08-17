

import java.io.*;
import java.util.StringTokenizer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.Class;

import ThreadShell.Producer;


public class Execute extends Thread{

private String name;
	
public Execute(String name){
		this.name=name;
  }

public void run(){
	
	StringTokenizer tok = new StringTokenizer(name);
    if (tok.hasMoreTokens()) {
      Token token = new Token(tok.nextToken());
      String s = "";
      while (tok.hasMoreTokens())
        s = s + " " + tok.nextToken();
      if (!s.equals(""))
        s = s.substring(1);
      switch (token.kind) {
      case Token.ATTRIB:
    	  (new Attrib(s)).start();
      	try {
			(new Attrib(s)).join();
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
        break;
      case Token.COPY:
    	  (new Copy(s)).start();
          try {
			(new Copy(s)).join();
		} catch (InterruptedException e2) {
			e2.printStackTrace();
		}
        break;
      case Token.DATE:
    		 (new MyDate()).start();
		try {
			(new MyDate()).join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
          break;
    	  
      case Token.DELETE:
    	  (new Delete(s)).start();
          try {
			(new Delete(s)).join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        break;
      case Token.DIR:
    	  (new Dir(s)).start();
          try {
			(new Dir(s)).join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        break;
      case Token.EDIT:
    	  (new Notepad()).start();
          try {
			(new Notepad()).join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        break;
      case Token.EXIT:
        System.exit(1);
      case Token.MKDIR:
    	  (new Mkdir(s)).start();
          try {
			(new Mkdir(s)).join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        break;
      case Token.RENAME:
    	  (new Rename(s)).start();
          try {
			(new Rename(s)).join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        break;
      case Token.RMDIR:
    	  (new Rmdir(s)).start();
          try {
			(new Rmdir(s)).join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
        break;
      case Token.TIME:
    	   (new MyTime()).start();
           try {
			(new MyTime()).join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
           break;
      case Token.PRODUCER:
    	  (new Producer()).start();
    	  try {
			(new Producer()).join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		/*	(new Consumer()).start();
	          try {
				(new Consumer()).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} */
	    
    	 
    	  
        break;

      case Token.CONSUMER:
          (new Consumer()).start();
		try {
			(new Consumer()).join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
      default:
        System.out.println("The given class does not exist");
    }
  }
    else {System.out.println("Class Name is missing");}
    }
}


