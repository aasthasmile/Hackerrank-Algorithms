package strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Panagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        String str=s.trim().toLowerCase();
        boolean flag=false;
        if(str.length()<26){
            flag=false;  
            
       }
        else{
            for (char i = 'a'; i <= 'z'; i++) {
            if (!(str.contains(i + ""))) {
                flag=false;
                break;
            }
            else
              {
                flag=true;
            }
        }
        
        }
         System.out.println(flag==true?"pangram":"not pangram");
    }
}