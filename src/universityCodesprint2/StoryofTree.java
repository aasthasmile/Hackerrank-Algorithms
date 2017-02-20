/**
 * 
 */
package universityCodesprint2;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class StoryofTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int bob[]=new int[n+1];
            bob[0]=9999;
            for(int a1 = 0; a1 < n-1; a1++){
                int u = in.nextInt();
                int v = in.nextInt();
                bob[v]=u;
            }
            int g = in.nextInt();
            int k = in.nextInt();
            int alice[]=new int[n+1];
            for(int i=0;i<n+1;i++)
            	alice[i]=-1;
            for(int a1 = 0; a1 < g; a1++){
                int u = in.nextInt();
                int v = in.nextInt();
                alice[v]=u;
            }
            
            int aliceTrees[][]=new int[n+1][n+1];                 
            
           for(int i=1;i<n+1;i++) {
        	   for(int j=1;j<n+1;j++){
        		   aliceTrees[i][j]=alice[j];   
        	   }
           }
           //System.arraycopy(bob, 1, aliceTrees[i], 1, n+1);
           
           for(int i=1;i<n+1;i++){
        	   for(int j=1;j<n+1;j++){
        		   
        		   if(i==j) aliceTrees[i][j]=0;
        		   System.out.print(aliceTrees[i][j] +"  ");
        	   }
        	   System.out.println();
           }
          
           int trueGuess=0;
           
           for(int i=1;i<n+1;i++){
        	   int count=0;
        	   for(int j=1;j<n+1;j++){
        		   if(aliceTrees[i][j]==bob[j]){
        			   count++;
        		   }
        		   
       			   
        	   }
        	   if(count>=k) trueGuess++;
        	   System.out.println(trueGuess);  
        	   System.out.println("count :"+count);
        	   
           }
           
         System.out.println(trueGuess);
           
          int gcdTree=gcd(trueGuess,n); 
          int num=trueGuess/gcdTree;
          int denom=n/gcdTree;
          System.out.println(num+"/"+denom);
        }
        
	}
	
	public static int gcd(int a,int b){
		
		if(a==0 || b==0) return a+b;
		return gcd(b,a%b);
	}
	
	

}
