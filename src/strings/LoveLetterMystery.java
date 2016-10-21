/**
 * 
 */
package strings;

/**
 * @author Aastha Jain
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LoveLetterMystery {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int k = 0; k < n; k++) {
			String s = sc.nextLine();
			int count = 0, max = 0;
			int j = s.length() - 1;
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) != s.charAt(j)) {
					count += Math.abs(s.charAt(i) - s.charAt(j));
				}
				j--;

			}
			System.out.println(count);

		}
	}
}
