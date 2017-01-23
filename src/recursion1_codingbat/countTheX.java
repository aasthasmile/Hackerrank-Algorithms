/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class countTheX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countX("xxhixx")+"");
	}
	
	public static int countX(String str) {
		  if(str.length()==0) return 0;
		  else 
			   return (str.charAt(0)=='x'?1:0)+countX(str.substring(1));
	}
}




