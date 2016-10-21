/**
 * 
 */
package algorithm_Implementation;

/**
 * @author Aastha Jain
 *
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPair {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		int count = 0, j = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		for (int a_i = 0; a_i < n; a_i++) {
			for (j = 0; j < n; j++) {
				if (a_i < j) {
					if ((a[a_i] + a[j]) % k == 0) {
						// System.out.println(a_i+" "+j);
						count = count + 1;
					}
				}
			}
		}
		System.out.println(count);
	}
}
