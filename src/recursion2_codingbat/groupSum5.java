/**
 * 
 */
package recursion2_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class groupSum5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[]=new int[]{2,5,10,11};
		boolean flag=groupSum5(0,nums,15);	
		
		System.out.println("Target :"+flag);
	}

	
	public static boolean groupSum5(int start, int[] nums, int target) {
		
		/*the base case is when start>=nums.length. In that case, return true if target==0*/
		if (start >= nums.length){
			return target == 0 ? true : false;
		}
		
		/*nums[start] is chosen i.e. Index start is subtracted from target and checked for desired outcome to be zero */
		if(nums[start]%5==0){
			return groupSum5(start+1, nums, target - nums[start]);
		}
		if(groupSum5(start+1, nums, target - nums[start])) {
			return true;
		}
		
		/*** nums[start] is not chosen */ 
		else if(groupSum5(start+1, nums, target)){
			return true;
		}
		
		return false;

	}
}
