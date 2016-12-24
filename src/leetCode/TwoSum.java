/**
 * 
 */
package leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Aastha Jain
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int nums[] = new int[] { 2, 7, 11, 15 };
		System.out.println(twoSum(nums, 9));
	}

	public static int[] twoSum(int[] nums, int target) {

		int[] index = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					index[0]=i;
					index[1]=j;
				}
			}
		}
		return index;
	}

}
