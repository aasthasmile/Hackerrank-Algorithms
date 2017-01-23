/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class AllStar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Aastha";
			System.out.println(allStar(str));
	}
	
	public static String allStar(String str) {
		  if(str.length()<=1) return str;
		  else 
			  return str.charAt(0)+"*"+allStar(str.substring(1));
		}


}
