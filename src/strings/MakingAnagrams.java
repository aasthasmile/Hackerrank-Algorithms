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

public class MakingAnagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        
        for(int i=0;i<s1.length();i++){
            arr1[((int)s1.charAt(i)-97)]++;
        }
        for(int j=0;j<s2.length();j++){
            arr2[((int)s2.charAt(j)-97)]++;
        }
        int count=0;
        for(int k=0;k<26;k++){
           // if(Math.abs(arr1[k]-arr2[k])!=0){
                count=count+Math.abs(arr1[k]-arr2[k]);
            //}
            
        }
        System.out.println(count);
        
            
    }
}