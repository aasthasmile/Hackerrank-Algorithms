/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class parentBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(parenBit("zz(abcd)xyzaastha"));
	}

	public static String parenBit(String str) {

		if(str.length()<2) return str;
		//System.out.println(str.charAt(0) + "");
		if (str.charAt(0) == '(') {
			return (str.substring(0, str.indexOf(")") + 1));
		}
		return parenBit(str.substring(1));
	}

}
