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

public class twoStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        sc.nextLine();
        for(int k=0;k<p;k++){
            String str1=sc.next();
            String str2=sc.next();
            Set<String> s1 = new TreeSet<String>();
            Set<String> s2 = new TreeSet<String>();
            for(int i=0;i<str1.length();i++){
                    s1.add(str1.charAt(i)+"");    
            }
            for(int j=0;j<str2.length();j++){
                    s2.add(str2.charAt(j)+"");    
            }
            
            
            s1.retainAll(s2);
            
            if(s1.size()>0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");     
            }
        }
        
    }
}