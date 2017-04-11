/**
 * 
 */
package Code30;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class Day11_HourGlassSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
						+ arr[i + 2][j + 2];

				System.out.println(sum);
				if (max < sum) {
					max = sum;
					sum=0;
				}
				else
					sum=0;
			}
		}
		System.out.println(max);
char ch='\000';
	}

}
