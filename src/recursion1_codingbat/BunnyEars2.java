/**
 * 
 */
package recursion1_codingbat;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class BunnyEars2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number : ");
	     Scanner sc=new Scanner(System.in);
	     int number=sc.nextInt();
	     
	     System.out.println("\nNumber of ears of for "+number+" bunnies is : "+bunnyEars2(number));
	}
	
	public static int bunnyEars2(int bunnies) {
		  if(bunnies==0) return 0;
		  else if(bunnies%2==0){
		    return bunnyEars2(bunnies-1)+3;
		  }else{
		    return bunnyEars2(bunnies-1)+2;
		  }
		}


}
