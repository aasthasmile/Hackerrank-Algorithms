package algorithm_Implementation;
import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int count1=0,count2=0;
        int temp1=0,temp2=0;
        for(int i=0;i<m;i++){
        temp1=a+apple[i];
            if(temp1>= s && temp1<=t){
                //System.out.println(temp1);
                count1++;
            }
        }
        for(int j=0;j<n;j++){
            temp2=b+orange[j];
            if(temp2>= s && temp2<=t){
                count2++;
            }
        }
        System.out.println(count1+"\n"+count2);
    }
}
