/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class ArraySix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 6, 4, 5 };
		System.out.println(array6(arr, 0));
	}

	public static boolean array6(int[] nums, int index) {
		if (nums.length == 0 || index == nums.length)
			return false;
		else if (nums[index] == 6)
			return true;
		else
			return array6(nums, index + 1);
	}

}


//Given an array of ints, compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
//
//array6([1, 6, 4], 0) → true
//array6([1, 4], 0) → false
//array6([6], 0) → true