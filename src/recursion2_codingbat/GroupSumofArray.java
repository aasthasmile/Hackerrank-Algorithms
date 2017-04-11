/**
 * 
 */
package recursion2_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class GroupSumofArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]=new int[]{2,4,8};
		boolean flag=groupSum(0,nums,10);	
		
		System.out.println("Target :"+flag);
	}

	/*
	 * The base case is when start>=nums.length. In that case, return true if target==0. Otherwise, 
	 * consider the element at nums[start]. The key idea is that there are only 2 possibilities -- 
	 * nums[start] is chosen or it is not. Make one recursive call to see if a solution is possible if 
	 * nums[start] is chosen (subtract nums[start] from target in that call). Make another recursive 
	 * call to see if a solution is possible if nums[start] is not chosen. Return true if either of the
	 *  two recursive calls returns true.
	 */
	public static boolean groupSum(int start, int[] nums, int target) {

		
		/*the base case is when start>=nums.length. In that case, return true if target==0*/
		if (start >= nums.length){
			return target == 0 ? true : false;
		}
		
		/** nums[start] is chosen i.e. Index start is subtracted from target and checked for desired outcome to be zero */
		if(groupSum(start+1, nums, target - nums[start])) {
			return true;
		}
		
		/*** nums[start] is not chosen */ 
		else if(groupSum(start+1, nums, target)){
			return true;
		}
		
		return false;

	}

}
