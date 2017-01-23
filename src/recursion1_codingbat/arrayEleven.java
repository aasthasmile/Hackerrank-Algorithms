/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class arrayEleven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = new int[] { 1, 11, 4, 5,11,9,8,11 };
			System.out.println(array11(arr, 0));
	}
	
	public static int array11(int[] nums, int index) {
		  if (nums.length == 0 || index == nums.length)
					return 0;
				else if (nums[index] == 11)
					return 1+array11(nums, index + 1);
				else
					return array11(nums, index + 1);
		}


}
