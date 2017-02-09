/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Count :"+strCount("catcowcat", "cat") );
	}

	public static int strCount(String str, String sub) {
		 if (str.length() < sub.length()) 
				return 0;
				
	int len=sub.length();
				
	if(str.substring(0,len).equals(sub))
	return 1+strCount(str.substring(len),sub);
	
	return strCount(str.substring(1),sub);
   }
	
}
