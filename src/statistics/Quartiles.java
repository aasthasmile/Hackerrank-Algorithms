/**
 * 
 */
package statistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aastha Jain
 *
 */
public class Quartiles {

	public static int quartiles(int start, int end, int[] array) {
		int Q = 0;
		int a = 0, b = 0;
		int size = end - start + 1;
		// System.out.println("size:"+size);
		for (int i = start; i < end; i++) {
			if (size % 2 != 0) {
				Q = array[(start + end) / 2];

			} else {
				a = array[(start + end) / 2];
				b = array[((start + end) / 2) + 1];
				Q = (a + b) / 2;
			}
		}
		return Q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int Q1 = 0, Q2 = 0, Q3 = 0;
		int size = in.nextInt();
		int array[] = new int[size];

		for (int i = 0; i < size; i++) {
			array[i] = in.nextInt();
		}
		Arrays.sort(array);

		int a = 0, b = 0;

		if (size % 2 != 0) {
			Q2 = array[(size / 2)];
			Q1 = quartiles(0, (size / 2) - 1, array);
			Q3 = quartiles((size / 2) + 1, size - 1, array);
		} else {
			a = array[(size / 2)];
			b = array[(size / 2) + 1];
			Q2 = (a + b) / 2;
			Q1 = quartiles(0, (size / 2), array);
			Q3 = quartiles((size / 2) + 1, size-1, array);
		}
		System.out.println(Q1 + "\n" + Q2 + "\n" + Q3);

	}

}
