/**
 * 
 */
package strings;

/**
 * @author Aastha Jain
 *
 */


	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class MarsExploration {

	    public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        String str= in.next();
	        StringBuilder snew=new StringBuilder();
	             for(int i=0;i<(str.length()/3);i++){
	                snew.append("SOS");
	            }
	        int count=0;
	        for(int i=0;i<str.length();i++){
	            if(str.charAt(i)!=snew.charAt(i)){
	            	count++;
	        }
	        
	        }
	        System.out.println(count);

	    }
	}


