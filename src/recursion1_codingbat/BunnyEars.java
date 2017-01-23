/**
 * 
 */
package recursion1_codingbat;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class BunnyEars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
	     Scanner sc=new Scanner(System.in);
	     int number=sc.nextInt();
	     
	     System.out.println("\nNumber of ears of for "+number+" bunnies is : "+bunnyEars(number));
	}

	public static int bunnyEars(int bunnies) {
		  if(bunnies==0) return 0;
		  else return bunnyEars(bunnies-1)+2;
		}

}
