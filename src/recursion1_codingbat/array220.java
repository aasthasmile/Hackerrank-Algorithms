/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class array220 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] { 1, 10, 4, 5,50,9,8,11 };
		System.out.println(array220(arr, 0));

	}

	public static boolean array220(int[] nums, int index) {
		if (nums.length < 2 || index == nums.length - 1)
			return false;
		if (10 * nums[index] == nums[index + 1])
			return true;
		return array220(nums, index + 1);
	}

}
