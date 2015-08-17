
	import java.io.*;
import java.util.StringTokenizer;
	/*
	  As we are going through the semester I will add more names to Token.java.
	  The errors that I mentioned in any class are the ones that I could think of
	  while I was writing the class. There may be more erros that I could not think
	  of. Please inform me if there are more errors so that I inform other students.
	*/
	class Main {
	    public static void main(String[] args) throws InterruptedException {
	      while(true){
	        System.out.print("PROMPT\\>");
	        String command = "";
	        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	        try {
	          command = stdin.readLine();
	        }
	        catch (Exception e) {
	          System.out.println(e);
	          return;
	        }
	        StringTokenizer tok = new StringTokenizer(command);
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
	            	(new Attrib(s)).join();
	            break;
	            case Token.COPY:
	              (new Copy(s)).start();
	              (new Copy(s)).join();
	              break;
	            case Token.DATE:
	              (new MyDate()).start();
	              (new MyDate()).join();
	              break;
	            case Token.DELETE:
	              (new Delete(s)).start();
	              (new Delete(s)).join();
	              break;
	            case Token.DIR:
	             (new Dir(s)).start();
	             (new Dir(s)).join();
	              break;
	            case Token.EDIT:
	              (new Notepad()).start();
	             (new Notepad()).join();
	              break;
	           case Token.EXEC:
	             (new Execute(s)).start();
	             (new Execute(s)).join();
	              break;
	            case Token.EXIT:
	              System.exit(1);
	            case Token.MKDIR:
	              (new Mkdir(s)).start();
	              (new Mkdir(s)).join();
	              break;
	            case Token.RENAME:
	              (new Rename(s)).start();
	              (new Rename(s)).join();
	              break;
	            case Token.RMDIR:
	              (new Rmdir(s)).start();
	              (new Rmdir(s)).join();
	              break;
	            case Token.TIME:
	              (new MyTime()).start();
	              (new MyTime()).join();
	              break;
	            default:
	              System.out.println("Wrong command.");
	          }
	        }
	      }
	    }

	}


