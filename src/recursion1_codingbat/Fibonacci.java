/**
 * 
 */
package recursion1_codingbat;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
	     Scanner sc=new Scanner(System.in);
	     int number=sc.nextInt();
	     
	     System.out.println("\nThe fibonacci of "+number+" is : "+fibonacci(number));

	}
	
	public static int fibonacci(int n) {
		  if(n<=1) return n;
		  else {
		    
		    return fibonacci(n-2)+fibonacci(n-1);
		  }
		}


}
