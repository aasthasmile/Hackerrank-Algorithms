package strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Gemstones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String s="";
        HashSet set=new HashSet();
        HashSet<Character> set1 = new HashSet<Character>();
        for(int i=0;i<n;i++){
        s=in.nextLine();
           
            for(int j=0;j<s.length();j++){
            if(set1.contains(s.charAt(j)))
                set1.add(s.charAt(j));
        }
        }
        System.out.println(set1.size());
    }
}