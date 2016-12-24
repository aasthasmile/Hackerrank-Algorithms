package algorithm_Implementation;

import java.util.Scanner;

public class DesignPDFViewer {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = 26;
	        int h[] = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        String word = in.next();
	        char[] ch=word.toCharArray();
	        
	        int maxheight=0;
	        for(int i=0;i<ch.length;i++){
	        	int asciiValue=(int)ch[i]-97;
	        	System.out.println(h[asciiValue]);
	        	maxheight=Math.max(h[asciiValue], maxheight);
	        	System.out.println(maxheight);
	          }
	        
	        System.out.println("The maximum height is:"+maxheight*ch.length);
	}
}
