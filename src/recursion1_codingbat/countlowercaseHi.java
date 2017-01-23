/**
 * 
 */
package recursion1_codingbat;

/**
 * @author Aastha Jain
 *
 */
public class countlowercaseHi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(""+countHi("shipyard_hi_oplo"));
	}
	
	public static int countHi(String str) {
		  if(str.length()<2) return 0;
		  if(str.substring(0, 2).equals("hi")||str.indexOf('x')!=-1)
		         return 1 + countHi(str.substring(2));
		  else return countHi(str.substring(1));
}

}
/*Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1*/