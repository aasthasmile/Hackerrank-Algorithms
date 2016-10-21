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

public class BeautifulBinaryString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String b = in.next();
        char[] B=b.toCharArray();
        int count=0;
        if(!(b.contains("010"))){
            System.out.println("0");
        }
        else{
            for (int i=0;i<n-2;i++){
                if (B[i]=='0' && B[i+2]=='0' && B[i+1]=='1') {
                 count++;
                 i+=2;
                }
                }
            System.out.println(count);
        }
            
    }
}

