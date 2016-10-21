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

public class GamesOfThrones {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String str = myScan.nextLine();
       
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        int[] ascii=new int[26];
        for(int i=0;i<str.length();i++){
             ascii[((int)str.charAt(i)-97)]++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(ascii[i]%2==0){
                continue;
            }
            else if(ascii[i]%2!=0){
                count++;
            }
        }
        if(count>1){
            ans="NO";
        }
        else{
            ans="YES";
        }
            
        
        System.out.println(ans);
        myScan.close();
    }
}

