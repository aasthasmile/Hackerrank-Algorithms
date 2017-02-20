/**
 * 
 */
package universityCodesprint2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class BreakingBestAndWorstRecords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		int[] highest = new int[n];
		int[] lowest = new int[n];

		System.arraycopy(score, 0, highest, 0, score.length);
		System.arraycopy(score, 0, lowest, 0, score.length);
		int high = 0, low = 0;
		;
		for (int i = 0; i < n - 1; i++) {
			if (highest[i] > highest[i + 1] )
				highest[i + 1] = highest[i];
//			else 
//				high++;
		}

		for (int i = 0; i < n - 1; i++) {
			if (lowest[i] < lowest[i + 1])
				lowest[i + 1] = lowest[i];
//			else
//				low++;

		}
		for (int i = 0; i < n - 1; i++) {
			if (highest[i] < highest[i + 1])
				high++;
			
		}

		for (int i = 0; i < n - 1; i++) {
			if (lowest[i] > lowest[i + 1])
				low++;
		}

		System.out.println("\n\n" + high + " " + low);

		
	}

}
