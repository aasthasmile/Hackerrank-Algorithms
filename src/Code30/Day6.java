/**
 * 
 */
package Code30;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class Day6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testcases = Integer.parseInt(scan.nextLine());

		for (int j = 0; j < testcases; j++) {
			String str = scan.nextLine();
			int len = str.length();
			StringBuilder even = new StringBuilder();
			StringBuilder odd = new StringBuilder();
			for (int i = 0; i < len; i++) {
				if (i % 2 != 0)
					odd.append(str.charAt(i));
				else
					even.append(str.charAt(i));

			}

			System.out.println(even.toString() + " " + odd.toString());
		}
	}

}
