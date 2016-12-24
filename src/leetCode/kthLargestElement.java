package leetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[] { 1, 2, 3, 1, 1, 2, 3, 4, 3, 3, 2, 2, 3, 2, 2, 3 };
		System.out.println(findKthLargest(nums, 2));

		int nums2[] = new int[] { 1, 2, 3, 1, 3 };
		System.out.println(findDuplicates(nums2));

	}

	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);

		return nums[nums.length - k];
	}

	public static List<Integer> findDuplicates(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == nums[i + 1])
				list.add(nums[i]);

		}
		return list;
	}
}
