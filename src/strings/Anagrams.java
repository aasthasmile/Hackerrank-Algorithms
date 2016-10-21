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

public class Anagrams {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();

		for (int a = 0; a < testcases; a++) {
			String str = sc.next();

			// char[] ch=str.toCharArray();

			if (str.length() % 2 != 0) {
				System.out.println("-1");
			} else {
				int[] counter1 = new int[26];
				int[] counter2 = new int[26];
				int diff = 0;
				int len = str.length();
				for (int i = 0; i < len / 2; i++)
					counter1[((int) str.charAt(i) - 97)]++;
				for (int k = len / 2; k < len; k++)
					counter2[((int) str.charAt(k) - 97)]++;

				for (int j = 0; j < 26; j++) {
					diff = diff + Math.abs(counter1[j] - counter2[j]);
				}
				System.out.println(diff / 2);
			}

		} // ending testcases

	}
}