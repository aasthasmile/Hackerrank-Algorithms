/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class changepi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(changePi("xpixpixpi"));
	}
	
	public static String changePi(String str) {
		  if(str.length()<2) return str;
		  if(str.substring(0,2).equals("pi"))
		       return "3.14"+changePi(str.substring(2));
		  else return str.charAt(0)+changePi(str.substring(1));
		}

}
