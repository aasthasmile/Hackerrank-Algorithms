/**
 * 
 */
package statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class MeanMedianMode {

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

		// Mean of n numbers
		float sum = 0, mean = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + array[i];
		}
		mean = sum / size;
		System.out.println(mean);

		// Median of n numbers
		Arrays.sort(array);
		float median = 0, median_b = 0;
		if (size % 2 != 0) {
			median = array[(size / 2)];
			System.out.println(median);
		} else {
			median = array[(size / 2)];
			median_b = array[(size / 2) - 1];
			System.out.println((median + median_b) / 2);
		}

		// Mode of n numbers
		HashMap<Integer, Integer> mode = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {
			if (mode.containsKey(array[i])) {
				mode.put(array[i], mode.get(array[i]) + 1);
			} else {
				mode.put(array[i], 1);
			}
		}

		int maxNum = Collections.max(mode.values());
		ArrayList<Integer> ar = new ArrayList<>();
		int mode_value = 0;
		
		for (Entry<Integer, Integer> entry : mode.entrySet()) {
			if (entry.getValue().equals(maxNum)) {
				ar.add(entry.getKey());
			}
		}
		mode_value = Collections.min(ar);
		System.out.println(mode_value);
	}

}
