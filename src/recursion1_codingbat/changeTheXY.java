/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class changeTheXY {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(changeXY("codexyz_xxyyzz"));
	}
	
	public static String changeXY(String str) {
		  if(str.length()==0) return str;
		  if(str.charAt(0)=='x') return "y"+changeXY(str.substring(1));
		  else return str.charAt(0)+changeXY(str.substring(1));
		}


}
