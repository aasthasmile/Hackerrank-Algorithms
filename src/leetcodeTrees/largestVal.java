/**
 * 
 */
package leetcodeTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Aastha Jain
 *
 */
public class largestVal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> largestValues(TreeNode root) {
		List<Integer> l=new ArrayList<Integer>();
        if(root==null) return Collections.EMPTY_LIST;
        Queue q=new LinkedList();
        q.offer(root);
        
        
        while(!q.isEmpty()){
            int min=9999;
            for(int i=0;i<q.size();i++){
            TreeNode temp=(TreeNode) q.poll();
            min=Math.min(min,(int) temp.val);
            if(temp.left!=null)
                q.offer(temp.left);
            if(temp.right!=null)
                q.offer(temp.right);
            }
            l.add(min);
                
        }
        return l;
    }

}
