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

public class SherlockAndAnagrams {

	private static boolean isAnagram(String s1, String s2) {
		int[] counter1 = new int[26];
		int[] counter2 = new int[26];
		// int diff=0;
		// int len=str.length();
		for (int i = 0; i < s1.length(); i++)
			counter1[((int) s1.charAt(i) - 97)]++;
		for (int k = 0; k < s2.length(); k++)
			counter2[((int) s2.charAt(k) - 97)]++;

		for (int j = 0; j < 26; j++) {
			if (counter1[j] != counter2[j])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int k = 0; k < testcase; k++) {
			String s = sc.next();
			String substr = "";
			ArrayList<String> ar = new ArrayList<String>();
			for (int i = 0; i < s.length(); i++) {
				// ar.add(s.charAt(i)+"");
				for (int j = i + 1; j <= s.length(); j++) {
					substr = s.charAt(i) + s.substring(i + 1, j);
					ar.add(substr);
				}
			}

			int count = 0;
			for (int ii = 0; ii < ar.size(); ii++) {
				String st1 = ar.get(ii);
				for (int jj = ii + 1; jj < ar.size(); jj++) {
					String st2 = ar.get(jj);
					if (st1.length() == st2.length()) {
						if (isAnagram(st1, st2))
							count++;

					}
				}
			}
			System.out.println(count);

		}
	}
}