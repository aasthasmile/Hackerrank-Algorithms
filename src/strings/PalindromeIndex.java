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

	public class PalindromeIndex {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner sc=new Scanner(System.in);
	        int testCases = sc.nextInt();
	        for(int k = 0; k < testCases; k++) {
	            String s = sc.next();
	             int index=-1;
	             int j=s.length()-1;
	            for(int i=0;i<s.length()/2;i++,j--)
	            {   
	            if(s.charAt(i)!=s.charAt(j))
	            {  
	               if(s.charAt(i+1)==s.charAt(j) && s.charAt(i+2)==s.charAt(j-1))
	                { index=i;
	                 break;
	                }
	                 if(s.charAt(i)==s.charAt(j-1))
	                {index=j;
	                 break;
	                }
	                 
	        } 

	    }
	        System.out.println(index);
	        }
	    }
	}

