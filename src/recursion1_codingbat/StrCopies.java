/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class StrCopies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean strCopies(String str, String sub, int n) {
		if (n == 0) 			return true;

		if (str.length() < sub.length()) 			return false;

		int len = sub.length();

		if (str.substring(0, len).equals(sub)) 
		     return strCopies(str.substring(1), sub, n - 1);
		return strCopies(str.substring(1), sub, n);
	}

}
