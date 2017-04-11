/**
 * 
 */
package Code30;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class Datatype {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int secondInt=Integer.parseInt(scan.nextLine());
        System.out.println("Enter the double:");
        double secondDoub=Double.parseDouble(scan.nextLine());
        System.out.println("Enter the string:");
        String str=scan.nextLine();
        StringBuilder secondstr=new StringBuilder();
        
        
       
        System.out.println(secondInt +i);
        System.out.println(secondDoub+d);
        System.out.println(s.concat(str));
        

	}

}
