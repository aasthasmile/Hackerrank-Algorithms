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

	public class AlternatingCharacters {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        String s ="";
	        for(int i=0;i<t;i++){
	            s = in.next();
	            int count=0;
	            for(int j=0;j<s.length()-1;j++){
	            if(s.charAt(j) == s.charAt(j+1)) {
	                count++;
	            } 
	        }
	             System.out.println(count);
	        }
	       
	        
	    }
	}