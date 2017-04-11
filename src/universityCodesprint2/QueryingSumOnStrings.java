/**
 * 
 */
package universityCodesprint2;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class QueryingSumOnStrings {

	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*String text="GEEKSFORGEEKS";
		String pattern="GEEKS";
		
		int count=zAlgorithm(text, pattern);
		System.out.println(count);*/
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int q = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		int[][] pairs = new int[m][2];
		for (int pairs_i = 0; pairs_i < m; pairs_i++) {
			for (int pairs_j = 0; pairs_j < 2; pairs_j++) {
				pairs[pairs_i][pairs_j] = in.nextInt();
			}
		}
		for (int a0 = 0; a0 < q; a0++) {
			String w = in.next();
			int a = in.nextInt();
			int b = in.nextInt();
			int sum = 0;
			for (int i = a; i <= b; i++) {
				String pattern = w.substring(pairs[i][0], pairs[i][1] + 1);
				int count = zAlgorithm(s, pattern);
				sum += count;
			}
			System.out.println(sum);
		}
	}

	// Pattern Matching z-algorithm
	public static int zAlgorithm(String text, String pattern) {
		StringBuilder concatString = new StringBuilder();
		concatString.append(pattern).append("$").append(text).toString();
		//System.out.println(concatString);
		
		int p_len = pattern.length();
		int s_len = text.length();

		int len = concatString.length();
		int z[] = new int[len];
		z[0] = 0;
		int l = 0, r = 0;

		for (int i = p_len + 1; i < len; i++) {
			l = 0;
			r = i;
			while (l < len && r < len && concatString.charAt(l) == concatString.charAt(r)) {
				//System.out.println("l= "+l+" r="+r);
				l++;
				r++;
				z[i]++;
			}

			//System.out.println("i= "+i+" l= "+l+" r="+r +" z["+i+"]="+z[i]);
			//if (z[i] >= 2) {

				for (int j = 1; j < z[i] - 1; j++) {
					if (l + j + z[j] < r) {
						z[l + j +1] = z[j];
					} else {
						i = l + j - 1;
						break;
					}
				}
				//i = r - 1;
			//}
		}

		int patternlen = pattern.length();
		int patternFound = 0;
		for (int i = 1; i < len; i++) {
			//System.out.print(z[i]+" ");
			if (z[i] == patternlen)
				patternFound++;
		}

		return patternFound;
	}
}
