/**
 * 
 */
package testing;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;



/**
 * @author afilipescu
 *
 */
public class NoRepeatedCharInAString {
	
	private String inputString= null;
	private Hashtable<String,Integer> hashtableobj = new Hashtable<String,Integer>();
	
	/**
	 * read method
	 */
	public void usingBufferedReader(){
	
	 System.out.println("Name: ");
	 
	  try{
	     BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	      inputString= bufferRead.readLine();
	      
	     System.out.println("Name entered : " + inputString);
	 }
	 catch(IOException ex)
	 {
	    ex.printStackTrace();
	 }
	
	}
	
	/**
	 * usingConsoleReader
	 */
	public static void usingConsoleReader()
	{
	  Console console = null;
	  String inputString = null;
	  try
	  {
	     // creates a console object
	     console = System.console();
	     // if console is not null
	     if (console != null)
	     {
	        // read line from the user input
	        inputString = console.readLine("Name: ");
	        // prints
	        System.out.println("Name entered : " + inputString);
	     }
	  } catch (Exception ex)
	  {
	     ex.printStackTrace();
	  }
	}
	
//	/**
//	 * Using Scanner
//	 * 
//	 */
//	private static void usingScanner()
//	{
//	  System.out.println("Name: ");
//	   
//	  Scanner scanIn = new Scanner(System.in);
//	  String inputString = scanIn.nextLine();
//	 
//	  scanIn.close();           
//	  System.out.println("Name entered : " + inputString);
//	}
//	
	/**
	 * string char count
	 */
    public void charCount(){
    	
    	int indexChar = 0;
    	
    	for (int i = 0; i< inputString.length();i++){
    		String s = inputString.substring(i, i+1);
    		if (hashtableobj.get(s) == null) {
    			indexChar = 1;
    		}
    		else {
    			/**
    			 * anything greater than 1; only 1 will be the solution
    			 */
    			
    			indexChar = 2;
    		}
    		System.out.println("Cheia sau valoarea: " +hashtableobj.get(s));
    		hashtableobj.put(s , indexChar);
    	}
      //we have to take the char from here after value 1
        System.out.println("Hashtable object output :"+ hashtableobj);
    }
    
    

	
}












