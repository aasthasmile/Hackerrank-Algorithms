/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class StrDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(strDist("catcowcatbhy", "cat"));
	}

	public static int strDist(String str, String sub) {

		int sublen = sub.length();
		
		if (str.indexOf(sub) == -1) return 0;

		int laststr = str.length() - sub.length();

		//System.out.println(str);
		if (str.substring(0, sublen).equals(sub)) {
			if (str.substring(laststr, str.length()).equals(sub)){
				//System.out.println(str.length());
				return str.length();
			}
				
			else
				return strDist(str.substring(0, str.length() - 1), sub);
		}
		return strDist(str.substring(1), sub);

	}

}
