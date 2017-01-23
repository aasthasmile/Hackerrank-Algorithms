
/**
 * 
 */
package recursion1_codingbat;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Enter the number : ");
     Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();
     
     System.out.println("\nThe factorial of "+number+" is : "+factorial(number));
     
	}
	
	public static int factorial(int n) {
		   int f=1;
		   if(n==1)
		    return f;
		  else{
		    return n* factorial(n-1);
		  }
		  
		}


}
