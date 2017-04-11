/**
 * 
 */
package recursion2_codingbat;

/**
 * @author Aastha Jain
 *
 *         Given an array of ints, is it possible to choose a group of some of
 *         the ints, such that the group sums to the given target with this
 *         additional constraint: If a value in the array is chosen to be in the
 *         group, the value immediately following it in the array must not be
 *         chosen. (No loops needed.)
 * 
 *         groupNoAdj(0, [2, 5, 10, 4], 12) → true
 *          groupNoAdj(0, [2, 5, 10, 4],14) → false 
 *         groupNoAdj(0, [2, 5, 10, 4], 7) → false
 */
public class groupNoAdjacent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = new int[] { 2, 5, 10, 4 };
		boolean flag = groupNoAdj(0, nums, 12);

		System.out.println("Target :" + flag);

	}

	public static boolean groupNoAdj(int start, int[] nums, int target) {

		/*
		 * the base case is when start>=nums.length. In that case, return true
		 * if target==0
		 */
		if (start >= nums.length) {
			return target == 0 ? true : false;
		}

		/**
		 * nums[start] is chosen i.e. Index start is subtracted from target and
		 * checked for desired outcome to be zero If a value in the array is
		 * chosen to be in the group, the value immediately following it in the
		 * array must not be chosen therefore start+2 rather than start+1
		 */
		if (groupNoAdj(start + 2, nums, target - nums[start])) {
			return true;
		}

		/*** nums[start] is not chosen */
		else if (groupNoAdj(start + 1, nums, target)) {
			return true;
		}

		return false;
	}

}
