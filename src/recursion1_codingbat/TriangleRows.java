/**
 * 
 */
package recursion1_codingbat;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class TriangleRows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
	     Scanner sc=new Scanner(System.in);
	     int number=sc.nextInt();
	     
	     System.out.println("\nTriangle with "+number+" rows = "+ triangle(number));
	}

	public static int triangle(int rows) {
		  if(rows==0) return 0;
		  else {
		    return rows+triangle(rows-1);
		  } 
		  
		}

}
