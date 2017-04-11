/**
 * 
 */
package Code30;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class Day7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=n-1; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
       
        in.close();
	}

}
