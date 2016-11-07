/**
 * 
 */
package statistics;

import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class WeightedMean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		int weight[] = new int[size];

		for (int i = 0; i < size; i++) {
			weight[i] = in.nextInt();
		}

		float weighted_mean = 0, sum = 0, sum_weight = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + (array[i] * weight[i]);
			sum_weight += weight[i];
		}
		//System.out.println(sum +"   "+sum_weight);
		weighted_mean = sum /sum_weight;
		System.out.println(weighted_mean);
	}

}
