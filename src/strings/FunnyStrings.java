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

public class FunnyStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            String s=sc.next();
            //boolean flag=false;
            int count=0;
            int original=0,reverse=0;
            for(int i=1;i<s.length();i++){
                    original=(int)s.charAt(i)-(int)s.charAt(i-1);
                    reverse=(int)s.charAt(s.length()-i)-(int)s.charAt(s.length()-i-1);
                    
                    if(Math.abs(original)==Math.abs(reverse)){
                        count++;
                    }
                    else{
                        count=0;
                        break;
                    }
                
            }
            System.out.println(count!=0?"Funny":"Not Funny");
        }
        
    }
}